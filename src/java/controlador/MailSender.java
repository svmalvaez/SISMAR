/*PRÁCTICA 3*/

package controlador;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class MailSender {

    private String miCorreo;
    private String password;
    
    final String servidorSMTP = "smtp.gmail.com";
    final String puertoEnvio = "465"; //465
    
    private String mailReceptor;
    private String asunto;
    private String cuerpo;
    
    private Properties props;
    private SecurityManager security;
    
    	public MailSender(String mail, String pwd) 
    	{
            this.miCorreo=mail;
            this.password=pwd;    
            this.props = new Properties();
            this.props.put("mail.smtp.user", miCorreo);
            this.props.put("mail.smtp.host", servidorSMTP);
            this.props.put("mail.smtp.port", puertoEnvio);
            this.props.put("mail.smtp.starttls.enable", "true");
            this.props.put("mail.smtp.auth", "true");
            this.props.put("mail.smtp.socketFactory.port", puertoEnvio);
            this.props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            this.props.put("mail.smtp.socketFactory.fallback", "false");
            this.security = System.getSecurityManager();
    	}
    	
    	public MailSender()
    	{
            this.miCorreo="luis.azanza.escom@gmail.com";
            this.password = "ingenieroJosh";
            this.mailReceptor="";
            this.asunto="";
            this.cuerpo="";
            this.props = new Properties();
            this.props.put("mail.smtp.user", miCorreo);
            this.props.put("mail.smtp.host", servidorSMTP);
            this.props.put("mail.smtp.port", puertoEnvio);
            this.props.put("mail.smtp.starttls.enable", "true");
            this.props.put("mail.smtp.auth", "true");
            this.props.put("mail.smtp.socketFactory.port", puertoEnvio);
            this.props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            this.props.put("mail.smtp.socketFactory.fallback", "false");
            this.security = System.getSecurityManager();
    	}
    	
    	public void setSenderAttributes(String mail, String pwd)
    	{
    		this.miCorreo=mail;
    		this.password=pwd;
    	}

    	public boolean send(String mailReceptor, String asunto, String cuerpo)
    	{
    		System.out.println(" Destino : "+mailReceptor+" Cuerpo : "+cuerpo);
    		if( this.miCorreo==null || this.password==null || this.miCorreo.equals("") || this.password.equals("") || asunto==null || cuerpo ==null )
    			return false;
    		
            this.mailReceptor = mailReceptor;
            this.asunto = asunto;
            this.cuerpo = cuerpo+"\n\n Mensaje autogenerado desde un servidor.";

            try {

                Authenticator auth = new autentificadorSMTP();
                Session session = Session.getInstance(props, auth);
                MimeMessage msg = new MimeMessage(session);
                msg.setText(this.cuerpo);
                msg.setSubject(this.asunto);
                msg.setFrom(new InternetAddress(miCorreo));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(mailReceptor));
                Transport.send(msg);
                return true;
                
            } catch (Exception mex) 
            { 
            	mex.printStackTrace();
            	System.err.println("ERROR: "+mex.getMessage());
            }

            
            return false;
    	}
    	
    	private class autentificadorSMTP extends javax.mail.Authenticator 
    	{
    		public PasswordAuthentication getPasswordAuthentication() 
    		{ 
        		return new PasswordAuthentication(miCorreo, password); 
    		}
    	}

    /**
     * @param args
     */


}