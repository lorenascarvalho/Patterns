package model;

public class NotificacaoPorSMS implements Notificacao {

	@Override
	public void notificarUsuario() {
		System.out.println("Enviar mensagem por SMS");
	}

}
