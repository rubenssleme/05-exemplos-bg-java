package mailSender;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {

    public static void main(String[] args) {

        final String username = "rubens.leme@laramara.org.br";
        final String password = "aju614728";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.laramara.org.br");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("rubens.leme@laramara.org.br"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("rubenss.leme@gmail.com"));
            message.setSubject("Envio de Email Teste Java");
            message.setText("Este email é teste,"
                + "\n\n Este email Não é spam, por favor!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}