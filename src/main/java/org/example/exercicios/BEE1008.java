package org.example.exercicios;

import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int time;
        double cash;

        number = sc.nextInt();
        time = sc.nextInt();
        cash = sc.nextDouble();

        double salary = cash * time;

        String format = String.format("%.2f", salary);

        System.out.println("NUMBER = "+ number);
        System.out.println("SALARY = U$ "+ format);


        sc.close();
    }
}
