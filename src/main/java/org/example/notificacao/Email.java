package org.example.notificacao;

public class Email implements Notificacao{
    @Override
    public void enviarMensagem(String msg, String email) {

    }

    @Override
    public void enviarMensagemEmail(String msg, String email) {
        System.out.println("Enviando um email para: " + email + " Conteudo da mensagem: " + msg);
    }
}
