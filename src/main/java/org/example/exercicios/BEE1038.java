package org.example.exercicios;

import java.util.Scanner;

public class BEE1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidadde;

        codigo = sc.nextInt();
        quantidadde = sc.nextInt();

        if (codigo == 1){
            System.out.printf("Total: R$ %.2f\n", quantidadde * 4.00);
        }else if (codigo == 2){
            System.out.printf("Total: R$ %.2f\n", quantidadde * 4.50);
        }else if (codigo == 3){
            System.out.printf("Total: R$ %.2f\n", quantidadde * 5.00);
        }else if (codigo == 4) {
            System.out.printf("Total: R$ %.2f\n", quantidadde * 2.00);
        }else if (codigo == 5){
            System.out.printf("Total: R$ %.2f\n", quantidadde * 1.50);
        }
    }
}
