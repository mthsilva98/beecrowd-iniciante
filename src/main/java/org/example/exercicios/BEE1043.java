package org.example.exercicios;

import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a ){
            System.out.printf("Perimetro = %.1f\n", (a+b+c));
        }else{
            System.out.printf("Area = %.1f\n", ((a+b)*c)/2);
        }
        sc.close();
    }
}
