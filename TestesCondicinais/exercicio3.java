package TestesCondicinais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		String senha = entrada.next();
		if (senha.equals("1234")) {
			System.out.println("ACESSO PERMITIDO!");
		} else {
			System.out.println("ACESSO NEGADO!");
		}
	}
	
}
