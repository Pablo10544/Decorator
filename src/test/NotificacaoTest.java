package test;

import main.Notificacao;
import main.NotificacaoEmail;
import main.NotificacaoSMS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificacaoTest {

    @Test
    void deveEnviarNotificacaoPorEmail() {
        Notificacao notificacao = new NotificacaoEmail();

        String resultado = notificacao.enviar("Pedido aprovado");

        assertEquals(
                "Enviando e-mail: Pedido aprovado",
                resultado
        );
    }

    @Test
    void deveEnviarNotificacaoPorEmailESMS() {
        Notificacao notificacao =
                new NotificacaoSMS(new NotificacaoEmail());

        String resultado = notificacao.enviar("Pedido aprovado");

        assertEquals(
                "Enviando e-mail: Pedido aprovado"
                        + "\nEnviando SMS: Pedido aprovado",
                resultado
        );
    }
}