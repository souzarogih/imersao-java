package org.example.exercicios;

public class Ex4 {
    public static void main(String[] args) {

          /*
        Faça um sistema que calcule a média de um aluno e diga se ele foi aprovado.
         */

        double primeiraNota = 10;
        double segundaNota = 10;
        double terceiraNota = 10;
        double quartaNota = 10;

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        boolean aprovado;

        if (media >= 7) {
            aprovado = true;
        } else {
            aprovado = false;
        }

        System.out.println("Média do aluno: " + media);
        System.out.println("Aluno aprovado? " + aprovado);

        if (aprovado) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Infelizmente você foi reprovado.");
        }

    }
}
