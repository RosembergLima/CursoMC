package br.com.curso.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.curso.services.DBService;
import br.com.curso.services.EmailService;
import br.com.curso.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instanciateDataBase() throws ParseException {
		dbService.instanciateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() throws ParseException {
		return new MockEmailService();
	}

}
