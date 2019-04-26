package com.airline.services.receipt;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import com.airline.bean.Order;

public class MailNotificationImp implements INotify {

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		System.out.println("Send receipt to user's email");
		Properties props = new Properties();
        Session session= Session.getInstance(props);        
        MimeMessage message = new MimeMessage(session);     
        try {
			message.setFrom(new InternetAddress("aa@send.com", "USER_AA", "UTF-8"));
			message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress("cc@receive.com", "USER_CC", "UTF-8"));
			message.addRecipient(MimeMessage.RecipientType.TO, new InternetAddress("dd@receive.com", "USER_DD", "UTF-8"));
//			message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress("ee@receive.com", "USER_EE", "UTF-8"));
//			message.setRecipient(MimeMessage.RecipientType.BCC, new InternetAddress("ff@receive.com", "USER_FF", "UTF-8"));

			message.setSubject("TEST topic", "UTF-8");

			message.setContent("TEST ", "text/html;charset=UTF-8");
			message.setSentDate(new Date());

			message.saveChanges();

			OutputStream out = new FileOutputStream("MyEmail.eml");
			message.writeTo(out);
			out.flush();
			out.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
