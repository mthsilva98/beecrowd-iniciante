package org.example.exercicios;

import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int abs = a + b;
        int maiorAB = (a + b + Math.abs(a - b)) /2;

        int Maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(Maior + " eh o maior");


        sc.close();
    }
}
