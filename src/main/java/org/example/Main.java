package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OutputInfo info = new OutputInfo();
        info.showInfo();

        CodeGenerator codeGenerator = new CodeGenerator();
        Employee employee = new Employee();

        Thread accessCodeGenerateThread = new Thread(codeGenerator.generateCode);
        accessCodeGenerateThread.start();

        Thread employeeThread = new Thread(employee.createEmployeeFile);
        employeeThread.start();


    }
}