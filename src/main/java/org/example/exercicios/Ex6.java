package org.example.exercicios;

public class Ex6 {
    public static void main(String[] args) {

        /*Sistema de Idade para Dirigir*/

        int idade = 20;
        boolean podeDirigir;

        if (idade >= 18) {
            podeDirigir = true;
            System.out.println("Você pode dirigir.");
        } else {
            podeDirigir = false;
            System.out.println("Você ainda não pode dirigir.");
        }

        System.out.println("Pode dirigir? " + podeDirigir);
    }
}
