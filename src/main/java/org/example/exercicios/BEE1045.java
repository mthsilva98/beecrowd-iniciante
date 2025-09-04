package org.example.exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BEE1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double[] lados = new Double[3];

        lados[0] = sc.nextDouble();
        lados[1] = sc.nextDouble();
        lados[2] = sc.nextDouble();

        Arrays.sort(lados, Collections.reverseOrder());

        double A = lados[0];
        double B = lados[1];
        double C = lados[2];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A * A == B * B + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < B * B + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((A == B) || (B == C) || (A == C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}