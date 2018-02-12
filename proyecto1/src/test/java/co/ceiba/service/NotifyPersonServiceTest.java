package test.java.co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import main.java.co.ceiba.domain.Persona;
import main.java.co.ceiba.service.EmailService;
import main.java.co.ceiba.service.NotifyPersonService;
import main.java.co.ceiba.testDataBuilder.PersonaTestDataBuilder;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;


	@Before
	public void setUp() throws Exception {
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		//Arrange
		Persona persona = new PersonaTestDataBuilder().build();
		//Act
		String message = notifyPersonService.notify(persona);
		//Assert
		Assert.assertNotNull(message);
	}

}
