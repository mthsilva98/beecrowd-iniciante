package org.example.exercicios;

import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double salarioFixo;
        double totalVendas;

        nome = sc.nextLine();
        salarioFixo = sc.nextDouble();
        totalVendas = sc.nextDouble();

        double comosao = (totalVendas * 15) /100;
        double salarioTotal = salarioFixo + comosao;

        String fortmat = String.format("%.2f", salarioTotal);

        System.out.println("TOTAL = R$ " + fortmat);


        sc.close();
    }
}
