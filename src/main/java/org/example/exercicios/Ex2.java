package org.example.exercicios;

public class Ex2 {
    public static void main(String[] args) {

          /*
        Faça um programa que verifica qual é o maior números dentre dois.
         */

        double num1 = 10;
        double num2 = 5;

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais!");
        }

    }
}
