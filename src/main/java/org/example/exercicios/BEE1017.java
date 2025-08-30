package org.example.exercicios;

import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        double kmPorLitro = 12;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        double quantidadeLitros = (tempo * velocidade) / kmPorLitro;
        String format = String.format("%.3f", quantidadeLitros);
        System.out.println(format);

    }
}
