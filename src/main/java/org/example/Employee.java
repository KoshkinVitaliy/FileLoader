package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class Employee {
    private final String[] employees =
            {"Black", "Smith", "Cold", "Kellton", "Michael",
                    "Bread", "DownTown", "Ally", "Comrade", "Like"};

    Runnable createEmployeeFile = () -> {
        createEmployeeFile(employees);
    };

    private void createEmployeeFile(String[] employees) {
        try(FileWriter writer = new FileWriter("employees.txt", false)) {
            for(int m=0; m < 10; m++) {
                try {
                    writer.write(employees[m] + "\n");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Creating employee File..." + m*10 + "%");

            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
