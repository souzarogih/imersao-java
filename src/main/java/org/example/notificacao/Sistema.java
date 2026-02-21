package org.example.notificacao;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Notificacao notificaoWhatsApp = new WhatsApp();
        Notificacao notificacaoSms = new Sms();
        Notificacao notificacaoEmail = new Email();

        int opcao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Opções: \n1 - Enviar msg whatsapp\n2 - Enviar mensagem de texto\n3 - Enviar email");
        opcao = sc.nextInt();

        String telefone = "";
        String email = "";
        if (opcao == 1 || opcao == 2){
            sc.nextLine(); // limpar o buffer
            System.out.println("Digite seu numero:");
            telefone = sc.nextLine();
        }else if (opcao == 3) {
            sc.nextLine(); // limpar o buffer
            System.out.println("Digite seu email:");
            email = sc.nextLine();
        }else {
            System.out.println("Opçao inválida, tente novamente.");
        }

        System.out.println("Digite sua mensagem");
        String msg = sc.nextLine();

        switch (opcao){
            case 1:
                notificaoWhatsApp.enviarMensagem(msg, telefone);
                break;
            case 2:
                notificacaoSms.enviarMensagem(msg, telefone);
                break;
            case 3:
                notificacaoEmail.enviarMensagemEmail(msg, email);
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");

        }
        sc.close();
    }
}
