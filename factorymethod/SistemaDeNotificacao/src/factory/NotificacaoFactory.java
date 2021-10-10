package factory;

import java.util.HashMap;

import model.Notificacao;
import model.NotificacaoPorEmail;
import model.NotificacaoPorPush;
import model.NotificacaoPorSMS;

public class NotificacaoFactory {

	public Notificacao CriarNotificacao(String tipoComunicacao) {
		if (tipoComunicacao == null || tipoComunicacao.isEmpty())
			return null;
		if ("SMS".equals(tipoComunicacao)) {
			return new NotificacaoPorSMS();
		} else if ("EMAIL".equals(tipoComunicacao)) {
			return new NotificacaoPorEmail();
		} else if ("PUSH".equals(tipoComunicacao)) {
			return new NotificacaoPorPush();
		}
		return null;

	}

}
