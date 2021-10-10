package model;

public class NotificacaoPorEmail implements Notificacao{

	@Override
	public void notificarUsuario() {
		System.out.println("Enviar mensagem por e-mail");		
	}

}
