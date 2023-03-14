
package PaqueteAgendar;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class ClaseConeccionesCorreo {
    static final String FROM = "aleumca16@gmail.com";
    static final String FROMENAME ="Mypets S.A";
    static final String SMTP_USERNAME = "aleumca16@gmail.com";
    static final String SMTP_PASSWORD ="cighoxykglzpwiir";
    static final String CONfIGSET = "ConfigSet";
    static final String HOST = "smtp.gmail.com";
    static final int PORT = 587;
    
    public void envirConfimacionCorreo(String Destinatario, String asunto,String cuerpo) throws UnsupportedEncodingException, MessagingException{
        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(props);
        MimeMessage mg = new MimeMessage(sesion);
        mg.setFrom(new InternetAddress(FROM,FROMENAME));
        mg.setRecipient(Message.RecipientType.TO, new InternetAddress(Destinatario));
        mg.setSubject(asunto);
        mg.setContent(cuerpo,"text/html");
        mg.setHeader("X-SES-CONFIGURATION-SET", CONfIGSET);
        Transport transporte = sesion.getTransport();
        try {
        
        transporte.connect(HOST,SMTP_USERNAME,SMTP_PASSWORD);
        transporte.sendMessage(mg, mg.getAllRecipients());
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            transporte.close();
        }
       
    
    }
}
