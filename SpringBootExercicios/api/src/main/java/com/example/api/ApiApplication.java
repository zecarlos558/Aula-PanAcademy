package com.example.api;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.api.model.Usuario;
import com.example.api.repositories.UsuarioRepository;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario("Marta Vieira da Silva",  "M10");
		Usuario u2 = new Usuario("Ronaldo Nazário de Lima",  "FENOMENO");
		Usuario u3 = new Usuario("José Carlos Nunes Coelho Neto",  "1234");
		Usuario u4 = new Usuario("Edson Arantes Do Nascimento",  "REIPELE");
		
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
	}

}
