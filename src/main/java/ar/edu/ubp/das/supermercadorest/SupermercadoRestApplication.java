package ar.edu.ubp.das.supermercadorest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SupermercadoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermercadoRestApplication.class, args);
	}

	// Bean que se ejecuta cuando el servidor está inicializado
	@Bean
	public ApplicationListener<WebServerInitializedEvent> onServerReady() {
		return event -> {
			int port = event.getWebServer().getPort();  // Obtiene el puerto del servidor
			System.out.println("La aplicación se está ejecutando en el puerto: " + port);
		};
	}
}
