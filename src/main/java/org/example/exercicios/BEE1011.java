package org.example.exercicios;

import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        double pi = 3.14159;

        raio = sc.nextDouble();
        double r = Math.pow(raio, 3);

        double volume = (4 / 3.0) * pi * r;

        String format = String.format("%.3f", volume);

        System.out.println("VOLUME = " + format);



        sc.close();
    }
}
