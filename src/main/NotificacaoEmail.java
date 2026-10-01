package main;


public class NotificacaoEmail implements Notificacao {

    @Override
    public String enviar(String mensagem) {
        return ("Enviando e-mail: " + mensagem);
    }
}