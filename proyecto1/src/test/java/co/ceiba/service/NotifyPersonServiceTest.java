package test.java.co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import main.java.co.ceiba.domain.Persona;
import main.java.co.ceiba.service.EmailService;
import main.java.co.ceiba.service.NotifyPersonService;
import main.java.co.ceiba.testDataBuilder.PersonaTestDataBuilder;

public class NotifyPersonServiceTest {
	
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;


	@Before
	public void setUp() throws Exception {
		//emailService = new EmailService();
		emailService = Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}

	@Test
	public void notifyTest() {
		//Arrange
		Persona persona = new PersonaTestDataBuilder().build();
		Mockito.when(emailService.sendMail(Mockito.anyString())).thenReturn("Hola mundo");
		//Act
		String message = notifyPersonService.notify(persona);
		//Assert
		System.out.println(message);
		//Assert.assertNotNull(message);
		Assert.assertNotNull(null);
	}

}
