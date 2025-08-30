package org.example.exercicios;

import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoPeca1;
        int quantidadePeca1;
        double valorPeca1;

        int codigoPeca2;
        int quantidadePeca2;
        double valorPeca2;

        codigoPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        double valorTolta = (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2);

        String format = String.format("%.2f", valorTolta);

        System.out.println("VALOR A PAGAR: R$ " + format);

        sc.close();

    }
    
}
