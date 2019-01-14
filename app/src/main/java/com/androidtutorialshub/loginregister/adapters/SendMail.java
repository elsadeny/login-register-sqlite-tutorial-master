package com.androidtutorialshub.loginregister.adapters;


import android.util.Log;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;


public class SendMail{

    public void SendMail(){}

    public void send(final String from, final String password, String to, String sub, String msg){
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "25");
        //get Session
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from,password);
                    }
                });
        //compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            //send message
            Transport.send(message);
            Log.d("ACT_CJECO","message sent successfully");
        } catch (MessagingException e) {throw new RuntimeException(e);}

    }

    public void sendMailSSL(){
        //from,password,to,subject,message
        send("alphasadeny@gmail.com","ishimwe001","alphasadeny@gmail.com","klwejlfw","klsfjfsl;ajk");
          }


}
