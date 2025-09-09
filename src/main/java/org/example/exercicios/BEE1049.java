package org.example.exercicios;

import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ave = "ave";
        String vertebrado = "vertebrado";
        String carnivoro = "carnivoro";
        String onivoro = "onivoro";
        String mamifero = "mamifero";
        String herbivoro = "herbivoro";

        String invertebrado = "invertebrado";
        String inseto = "inseto";
        String hematofago = "hematofago";
        String anelideo = "anelideo";



        String nome1 = sc.nextLine();
        String nome2 = sc.nextLine();
        String nome3 = sc.nextLine();

        if (nome1.equals(vertebrado) && nome2.equals(ave) && nome3.equals(carnivoro)) {
            System.out.println("aguia");

        } else if (nome1.equals(vertebrado) && nome2.equals(ave) && nome3.equals(onivoro)) {
            System.out.println("pomba");
        } else if (nome1.equals(vertebrado) && nome2.equals(mamifero) && nome3.equals(onivoro)) {
            System.out.println("homem");
        } else if (nome1.equals(vertebrado) && nome2.equals(mamifero) && nome3.equals(herbivoro)) {
            System.out.println("vaca");
        } else if (nome1.equals(invertebrado) && nome2.equals(inseto) && nome3.equals(hematofago)) {
            System.out.println("pulga");
        } else if (nome1.equals(invertebrado) && nome2.equals(inseto) && nome3.equals(herbivoro)) {
            System.out.println("lagarta");
        } else if (nome1.equals(invertebrado) && nome2.equals(anelideo) && nome3.equals(hematofago)) {
            System.out.println("sanguessuga");
        } else if (nome1.equals(invertebrado) && nome2.equals(anelideo) && nome3.equals(onivoro)) {
            System.out.println("minhoca");
        }
    }
}
