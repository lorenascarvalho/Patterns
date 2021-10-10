package factory;

import model.Notificacao;

public class App {
	public static void main(String[] args) {
		NotificacaoFactory notificacaoFactory = new NotificacaoFactory();
		Notificacao notificacao = notificacaoFactory.CriarNotificacao("SMS");
		notificacao.notificarUsuario();

		Notificacao notificacao2 = notificacaoFactory.CriarNotificacao("EMAIL");
		notificacao2.notificarUsuario();

		Notificacao notificacao3 = notificacaoFactory.CriarNotificacao("PUSH");
		notificacao3.notificarUsuario();
	}
}
