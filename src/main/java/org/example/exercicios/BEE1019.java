package org.example.exercicios;

import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        int minutos = segundos % 3600 / 60;
        segundos = segundos % 60;

        System.out.println(horas+":"+minutos+":"+segundos);


    }
}
