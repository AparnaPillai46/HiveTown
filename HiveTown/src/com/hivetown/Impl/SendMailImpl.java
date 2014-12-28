package com.hivetown.Impl;

import java.sql.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.hivetown.util.HiveTownConstant;

public class SendMailImpl {
	public static String SendMail(String email,String content) {
		Properties props = new Properties();
		props.put(HiveTownConstant.MAIL_SMTP_HOST, HiveTownConstant.MAIL_SMTP_HOST_SERVER);
		props.put(HiveTownConstant.MAIL_SMTP_SOCKETFACTORY_PORT, HiveTownConstant.MAIL_SMTP_SOCKETFACTORY_PORT_NO);
		//TODO move to constant
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("hivetowndev@gmail.com",
								"test@321");
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from@no-spam.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Testing Subject");
			message.setText(content);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	
	
}