package br.com.bscpaz.organizador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import br.com.bscpaz.organizador.services.ArquivoServices;

@SpringBootApplication
public class OrganizadorFotosApplication {

    private static String pastaRaizOrigem = "D:\\Pessoal";
    private static String pastaRaizDestino = "D:\\Fotos";
	
	public static void main(String[] args) {
		SpringApplication.run(OrganizadorFotosApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
	        ArquivoServices arquivoServices = new ArquivoServices(pastaRaizOrigem, pastaRaizDestino);
	        arquivoServices.organizaFotosEVideos();

	        System.out.println("Total de arquivos movidos: " + arquivoServices.getContador());
		};
	}
}
