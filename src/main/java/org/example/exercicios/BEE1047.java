package org.example.exercicios;

import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int horaInicio = sc.nextInt();
        int minutoInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int minutoFim = sc.nextInt();

        int duracaoTotalEmMinutos;

        int inicioEmMinutos = (horaInicio * 60) + minutoInicio;
        int fimEmMinutos = (horaFim * 60) + minutoFim;

        if (inicioEmMinutos == fimEmMinutos) {
            duracaoTotalEmMinutos = 24 *60;
        } else if (fimEmMinutos < inicioEmMinutos) {
            final int Minutos_NO_DIA = 24 * 60;
            duracaoTotalEmMinutos = (Minutos_NO_DIA - inicioEmMinutos) + fimEmMinutos;
        } else {
            duracaoTotalEmMinutos = fimEmMinutos - inicioEmMinutos;
        }

        int horas = duracaoTotalEmMinutos / 60;
        int minutos  = duracaoTotalEmMinutos % 60;

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");


        sc.close();
    }
}
