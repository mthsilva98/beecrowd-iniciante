package org.example.exercicios;


import java.util.Arrays;
import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] original = new int[3];


        for (int i = 0; i < 3; i++) {
            original[i] = scanner.nextInt();
        }

        int[] ordenado = original.clone();
        Arrays.sort(ordenado);

        for (int num : ordenado) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : original) {
            System.out.println(num);
        }

        scanner.close();
    }
}
