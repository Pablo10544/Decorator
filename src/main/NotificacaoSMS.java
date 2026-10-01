package main;

public class NotificacaoSMS extends NotificacaoDecorator {

    public NotificacaoSMS(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem)
                + "\nEnviando SMS: " + mensagem;    }
}