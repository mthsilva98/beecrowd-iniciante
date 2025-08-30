package org.example.exercicios;

import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        double valorDouble = sc.nextDouble();

        // Multiplica o valor por 100 e converte para int para evitar problemas com
        // ponto flutuante.
        // Adiciona 0.5 para garantir um arredondamento correto.
        int valorTotalCentavos = (int) (valorDouble * 100 + 0.5);

        System.out.println("NOTAS:");

        int[] notasCentavos = {10000, 5000, 2000, 1000, 500, 200};
        int[] notasReais = {100, 50, 20, 10, 5, 2};

        for (int i = 0; i < notasCentavos.length; i++) {
            int quantidade = valorTotalCentavos / notasCentavos[i];
            System.out.printf("%d nota(s) de R$ %d.00%n", quantidade, notasReais[i]);
            valorTotalCentavos %= notasCentavos[i];
        }

        System.out.println("MOEDAS:");

        int[] moedasCentavos = {100, 50, 25, 10, 5, 1};
        double[] moedasReais = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        for (int i = 0; i < moedasCentavos.length; i++) {
            int quantidade = valorTotalCentavos / moedasCentavos[i];
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moedasReais[i]);
            valorTotalCentavos %= moedasCentavos[i];
        }

        sc.close();
    }
}
