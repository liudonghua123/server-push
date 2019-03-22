package com.liudonghua.tutorials.serverpush;

import java.security.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.dentrassi.crypto.pem.PemKeyStoreProvider;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Security.addProvider(new PemKeyStoreProvider());
		SpringApplication.run(Application.class, args);
	}

}
