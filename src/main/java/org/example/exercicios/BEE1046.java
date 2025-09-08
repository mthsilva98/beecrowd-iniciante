package org.example.exercicios;

import java.util.Scanner;

public class BEE1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();

        int totalHoras;

        if (horaInicio == horaFim) {
            totalHoras = 24;
        } else if (horaFim >= horaInicio) {
            totalHoras = horaFim - horaInicio;
        } else {
            totalHoras = (24 - horaInicio) + horaFim;
        }
        System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");




        sc.close();
    }
}
