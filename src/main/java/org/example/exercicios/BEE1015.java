package org.example.exercicios;

import java.util.Scanner;

public class BEE1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double total = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String format = String.format("%.4f", total);

        System.out.println(format);

        sc.close();

    }
}
