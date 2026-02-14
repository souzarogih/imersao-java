package org.example.exercicios;

public class Ex3 {

    public static void main(String[] args) {

    /*
    Faça um programa que faça os cálculos matemáticos com todos os operadores aritméticos visto em aula.
    * */

        double primeiroNumero = 2;
        double segundoNumero = 3;

        double resultadoMultiplicacao = primeiroNumero * segundoNumero;
        double resultadoDivisao = primeiroNumero / segundoNumero;
        double resultadoRestoDivisao = primeiroNumero % segundoNumero;

        System.out.println("A soma de " + primeiroNumero + " com " + segundoNumero + " é: " + (primeiroNumero + segundoNumero));
        System.out.println("A subtração de " + primeiroNumero + " com " + segundoNumero + " é: " + (primeiroNumero - segundoNumero));
        System.out.println("A multiplicação de " + primeiroNumero + " com " + segundoNumero + " é: " + resultadoMultiplicacao);
        System.out.println("A divisão de " + primeiroNumero + " com " + segundoNumero + " é: " + resultadoDivisao);
        System.out.println("O resto da divisão de " + primeiroNumero + " com " + segundoNumero + " é: " + resultadoRestoDivisao);

    }
}
