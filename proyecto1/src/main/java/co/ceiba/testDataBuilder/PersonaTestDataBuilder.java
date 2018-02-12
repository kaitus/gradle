package main.java.co.ceiba.testDataBuilder;

import main.java.co.ceiba.domain.Persona;

public class PersonaTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonaTestDataBuilder() {
		this.name = "Ceiba";
		this.lastName = "Software House";
	}
	
	public PersonaTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonaTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Persona build() {
		return new Persona(this.name, this.lastName);
	}
	

}
