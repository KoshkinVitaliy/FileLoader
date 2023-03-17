package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {
    Runnable generateCode = () -> {
        generateFile(generateAccessCode());
    };

    private void generateFile(int[] accessCodeArray) {
        try(FileWriter writer = new FileWriter("access_codes.txt", false)) {
            for(int k=0; k < 10; k++) {
                try {
                    writer.write(accessCodeArray[k] + "\n");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Generating codes..." + k*10 + "%");
            }
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private int[] generateAccessCode() {
        int [] accessCodeArray = new int[10];
        int maxNum = 999999;
        int minNum = 100000;
        for (int i=0; i < 10; i++) {
            accessCodeArray[i] = (int) ((Math.random() * ++maxNum) + minNum);
        }
        return accessCodeArray;
    }
}
