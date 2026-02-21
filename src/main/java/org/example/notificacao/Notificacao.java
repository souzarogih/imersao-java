package org.example.notificacao;

public interface Notificacao {
    void enviarMensagem(String msg, String numeroTelefone);
    void enviarMensagemEmail(String msg, String email);
}
