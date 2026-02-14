package org.example.exercicios;

public class Ex12 {
    public static void main(String[] args) {

        // Declare as variáveis
        String nome = "Carlos";
        int idade = 20;
        double nota1 = 8.0;
        double nota2 = 6.0;
        boolean aprovado;

        // Calcule a média
        double media = (nota1 + nota2) / 2;
        System.out.println("Média obtida: " + media);

        // Verifique se está aprovado
        if (media >= 7) {
            aprovado = true;
            System.out.println("Situação: Aprovado");
        } else {
            aprovado = false;
            System.out.println("Situação: Reprovado");
        }

        // Mostre todos os dados organizados
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Aprovado? " + aprovado);
    }
}
