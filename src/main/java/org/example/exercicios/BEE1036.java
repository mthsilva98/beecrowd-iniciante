package org.example.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");


        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();


        double delta = Math.pow(b, 2) - 4 * a * c;


        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {

            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);


            System.out.println("R1 = " + df.format(raiz1));
            System.out.println("R2 = " + df.format(raiz2));
        }

        scanner.close();


    }
}
