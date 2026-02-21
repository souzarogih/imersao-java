package org.example.notificacao;

public class Sms implements Notificacao{
    @Override
    public void enviarMensagem(String msg, String numeroTelefone) {
        System.out.println("Enviando um sms para: " + numeroTelefone + " Conteudo da mensagem: " + msg);
    }

    @Override
    public void enviarMensagemEmail(String msg, String email) {

    }
}
