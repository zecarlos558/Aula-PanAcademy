package TestesCondicinais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = entrada.nextInt();
		int anoAtual = 2021;
		int idade = anoAtual - anoNascimento;
		if (idade >= 18) {
			System.out.println("Você tem permissão para votar");
		} else {
			System.out.println("Você não tem idade para votar");
		}
		
	}
	
}
