package model;

public class NotificacaoPorPush implements Notificacao {

	@Override
	public void notificarUsuario() {
		System.out.println("Enviar mensagem por Push");
	}

}
