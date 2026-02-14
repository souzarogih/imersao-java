package org.example.exercicios;

public class Ex7 {
    public static void main(String[] args) {

        /*Cálculo de IMC (bem simples)*/

        double peso = 80.0;
        double altura = 1.75;

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc >= 25) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Peso normal");
        }

    }
}
