package br.laramara.ti.sisweb.utilitarios;

import java.io.Serializable;
import java.util.Properties;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ApplicationScoped
public class Email implements Serializable {

	private static final long serialVersionUID = 1935306989677460783L;
	private Logger logger = Logger.getLogger(this.getClass().getPackage()
			.getName());

	public synchronized boolean enviarArquivoContagemPorEmail(
			String emailDestino, String chave) {
		boolean sucesso = false;
		try {
			Properties props = new Properties();
			props.put("mail.transport.protocol", "smtp");

			Session mailSession = Session.getDefaultInstance(props);
			Transport transport = mailSession.getTransport();

			MimeMessage message = new MimeMessage(mailSession);
			message.setSubject("Alterar senha do " + Sessao.SISWEB);
			message.setFrom(new InternetAddress(Configuracao.obterConfiguracao(
					this, Configuracao.ORIGEM)));
			message.setContent(
					"<a href=\"http://"
							+ Configuracao.obterConfiguracao(this,
									Configuracao.IP_LINK_EMAIL)
							+ ":"
							+ Configuracao.obterConfiguracao(this,
									Configuracao.PORTA_APLICACAO) + "/"
							+ Sessao.SISWEB + "/recuperarSenha.xhtml?chave="
							+ chave
							+ "\">Para recuperar ou alterar sua senha do "
							+ Sessao.SISWEB + ", clique aqui.</a>",
					Configuracao
							.obterConfiguracao(this, Configuracao.MIME_HTML));
			message.addRecipients(Message.RecipientType.CC, emailDestino);

			transport.connect(Configuracao.obterConfiguracao(this,
					Configuracao.HOST), Integer.parseInt(Configuracao
					.obterConfiguracao(this, Configuracao.NUMERO_PORTA)),
					Configuracao.obterConfiguracao(this, Configuracao.ORIGEM),
					Configuracao.obterConfiguracao(this, Configuracao.SENHA));
			transport.sendMessage(message,
					message.getRecipients(Message.RecipientType.CC));
			transport.close();
			sucesso = true;
		} catch (Exception e) {
			logger.severe("Erro durante envio de email: " + e.getMessage());
		}
		return sucesso;
	}
}
