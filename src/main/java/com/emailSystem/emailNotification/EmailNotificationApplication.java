package com.emailSystem.emailNotification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailNotificationApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerEmail(){
		emailSenderService.sendSimpleEmail("anishravula0@gmail.com","This is the body of the email","This is the subject of the email");
	}
}
