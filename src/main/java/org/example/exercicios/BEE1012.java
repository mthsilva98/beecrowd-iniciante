package org.example.exercicios;

import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double triangulo = (a * c) /2;
        String tri = String.format("%.3f", triangulo);

        double circulo = pi * c * c;
        String cir = String.format("%.3f", circulo);

        double trapezio = ((a + b) * c) / 2;
        String tra = String.format("%.3f", trapezio);

        double quadrado = b * b;
        String qua = String.format("%.3f", quadrado);

        double retangulo = a * b;
        String ret = String.format("%.3f", retangulo);

        System.out.println("TRIANGULO: " + tri);
        System.out.println("CIRCULO: " + cir);
        System.out.println("TRAPEZIO: " + tra);
        System.out.println("QUADRADO: " + qua);
        System.out.println("RETANGULO: " + ret);



        sc.close();
    }
}
