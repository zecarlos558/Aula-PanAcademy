package TestesCondicinais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua primeira nota");
		float nota1 = entrada.nextFloat();
		System.out.println("Digite sua segunda nota");
		float nota2 = entrada.nextFloat();
		double media = (nota1 + nota2) / 2;
		if (media < 7) {
			System.out.println("REPROVADO!");
		} else if (media == 10 ) {
			System.out.println("APROVADO COM DISTINÇÃO!");
		} else if (media >= 7) {
			System.out.println("APROVADO!");
		}
	}
	
}
