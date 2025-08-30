package org.example.exercicios;

import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorLido = sc.nextInt();
        int valorRestante = valorLido;

        System.out.println(valorLido);

        int notas100 = valorRestante / 100;
        valorRestante = valorRestante % 100;
        System.out.println(notas100 + " nota(s) de R$ 100,00");

        int notas50 = valorRestante / 50;
        valorRestante = valorRestante % 50;
        System.out.println(notas50 + " nota(s) de R$ 50,00");

        int notas20 = valorRestante / 20;
        valorRestante = valorRestante % 20;
        System.out.println(notas20 + " nota(s) de R$ 20,00");

        int notas10 = valorRestante / 10;
        valorRestante = valorRestante % 10;
        System.out.println(notas10 + " nota(s) de R$ 10,00");

        int notas5 = valorRestante / 5;
        valorRestante = valorRestante % 5;
        System.out.println(notas5 + " nota(s) de R$ 5,00");

        int notas2 = valorRestante / 2;
        valorRestante = valorRestante % 2;
        System.out.println(notas2 + " nota(s) de R$ 2,00");

        int notas1 = valorRestante;
        System.out.println(notas1 + " nota(s) de R$ 1,00");

        sc.close();
    }
}
