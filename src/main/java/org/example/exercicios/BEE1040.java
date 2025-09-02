package org.example.exercicios;

import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        System.out.printf("Media: %.1f\n", Math.floor(media * 10) / 10);


        if (media >= 5.0 && media <= 6.9) {
            double notaExame = sc.nextDouble();
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            if (notaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else if (notaExame <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", (notaExame + media) /2);
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}
