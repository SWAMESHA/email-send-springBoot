package com.emailsending.emailsend;

import com.emailsending.emailsend.controller.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSendApplication {


	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSendApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmails(){
		emailService.sendEmail("swamesha123@gmail.com","Task","my task is completed");

	}

}
