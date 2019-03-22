package com.liudonghua.tutorials.serverpush;

import java.security.Security;

import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import de.dentrassi.crypto.pem.PemKeyStoreProvider;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Security.addProvider(new PemKeyStoreProvider());
		SpringApplication.run(Application.class, args);
	}

	// @Bean
	// public WebServerFactoryCustomizer<TomcatServletWebServerFactory>
	// tomcatCustomizer() {
	// return (container) -> {
	// container.addConnectorCustomizers((connector) -> {
	// connector.addUpgradeProtocol(new Http2Protocol());
	// });
	// };
	// }

	// @Bean
	// public ConfigurableServletWebServerFactory tomcatCustomizer() {
	// TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	// factory.addConnectorCustomizers(connector -> connector.addUpgradeProtocol(new
	// Http2Protocol()));
	// return factory;
	// }

}
