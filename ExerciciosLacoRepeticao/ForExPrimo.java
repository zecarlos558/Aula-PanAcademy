package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class ForExPrimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite o número: ");
		numero = entrada.nextInt();
		int contadorDivisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contadorDivisores = contadorDivisores + 1;
			}
		}
		System.out.println("Possui "+contadorDivisores+" divisores");
		if (numero == 1) {
			System.out.println("Não é primo");
		} else if (contadorDivisores == 2) {
			System.out.println("É número primo");
		} else {
			System.out.println("Não é primo");
		}
	}
	
}
