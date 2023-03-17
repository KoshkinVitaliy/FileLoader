package org.example;

import java.util.Scanner;

public class OutputInfo {

    private int showScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сотрудника: ");

        return scanner.nextInt();
    }

    private String readSurname() {
        return "name";
    }

    private int readAccessCode() {
        return 0;
    }

    public void showInfo() {
        showScanner();
        
        System.out.println("Сотрудник - " + readSurname()
                + ", код доступа: " + readAccessCode());
    }
}
