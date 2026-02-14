package org.example.exercicios;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        /*Faça um menu de atendimento */

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU DE ATENDIMENTO =====");
        System.out.println("1 - Informações sobre produtos");
        System.out.println("2 - Falar com atendente");
        System.out.println("3 - Consultar pedido");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Você escolheu: Informações sobre produtos.");
                break;

            case 2:
                System.out.println("Você será direcionado para um atendente.");
                break;

            case 3:
                System.out.println("Digite o número do seu pedido:");
                int numeroPedido = scanner.nextInt();
                System.out.println("Consultando pedido: " + numeroPedido);
                break;

            case 4:
                System.out.println("Encerrando atendimento...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();

    }
}
