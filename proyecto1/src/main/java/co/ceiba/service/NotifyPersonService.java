package main.java.co.ceiba.service;

import main.java.co.ceiba.domain.Persona;

public class NotifyPersonService {
	
	private EmailService emailService;

	public NotifyPersonService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	public String notify(Persona persona) {
		String message = "Welcome " + persona.getName();
		return emailService.sendMail(message);
	}
	
}
