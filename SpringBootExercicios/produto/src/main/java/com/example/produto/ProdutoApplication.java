package com.example.produto;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.produto.model.Produto;
import com.example.produto.repositories.ProdutoRepository;

@SpringBootApplication
public class ProdutoApplication implements CommandLineRunner {

	@Autowired
	ProdutoRepository produtoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProdutoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Produto p1 = new Produto("Monitor LG 29 UltraWide", 1259.00);
		Produto p2 = new Produto("Placa de Video GEFORCE GTX 1650",2500.00);
		Produto p3 = new Produto("PC Gamer 16gb RAM Intel Core I5 10°G",3000.00);
		Produto p4 = new Produto("Headset JBL Quantum 100 ",160.00);
		Produto p5 = new Produto("Nobreak RagTech 1500VA",1300.00);
		Produto p6 = new Produto("WebCam Full HD com Microfone",60.00);
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
	}
	
}
