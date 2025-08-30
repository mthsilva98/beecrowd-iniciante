package org.example.exercicios;

import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km;

        km = sc.nextInt();

        int tempo = km * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
