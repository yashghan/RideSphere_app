package com.example.transport.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import rs.ac.uns.ftn.transport.model.UserActivation;
import rs.ac.uns.ftn.transport.service.interfaces.IMailService;

import java.io.UnsupportedEncodingException;

@Service
public class MailService implements IMailService {
    private final JavaMailSender mailSender;

    String activationMessage =
            "<p>Pozdrav,</p>"
                    + "<p>Aktivaciju naloga možete obaviti klikom na sledeći link:</p>";

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String recipientEmail, String token) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom("cargobrr2023@gmail.com", "CarGoBrr");
        helper.setTo(recipientEmail);

        String subject = "Token za reset lozinke";

        String content = "<p>Pozdrav,</p>"
                + "<p>Zatražili ste da resetujete Vašu lozinku.</p>"
                + "<p>Ovo je token koji Vam je potreban za reset lozinke:</p>"
                + token + "<br>"
                + "<p>Ignorišite ovaj email ako se sećate Vaše lozinke, "
                + "ili ako niste napravili ovaj zahtev.</p>";

        helper.setSubject(subject);

        helper.setText(content, true);

        mailSender.send(message);
    }

    @Override
    public void sendActivationEmail(String recipientEmail, UserActivation activation) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setFrom("cargobrr2023@gmail.com", "CarGoBrr");
        helper.setTo(recipientEmail);

        String subject = "Aktivacija naloga";

        String activationLink = "http://localhost:8080/api/passenger/activate/" + activation.getId();
        String body = this.activationMessage +
                "<a href='" + activationLink + "'>" + activationLink;

        helper.setSubject(subject);

        helper.setText(body, true);

        mailSender.send(message);
    }
}
