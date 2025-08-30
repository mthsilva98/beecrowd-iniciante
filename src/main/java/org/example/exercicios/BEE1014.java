package org.example.exercicios;

import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km;
        double litrosGasto;

        km = sc.nextInt();
        litrosGasto = sc.nextDouble();

        double consumo = km / litrosGasto;
        String fortmat = String.format("%.3f", consumo);
        System.out.println(fortmat + " km/l");
    }
}
