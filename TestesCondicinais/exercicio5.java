package TestesCondicinais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro �ngulo: ");
		int lado1 = entrada.nextInt();
		System.out.println("Digite o segundo �ngulo: ");
		int lado2 = entrada.nextInt();
		System.out.println("Digite o terceiro �ngulo: ");
		int lado3 = entrada.nextInt();
		int soma = lado1+lado2+lado3;
		System.out.println("------------------------------");
		if (soma == 90) {
			System.out.println("� um Tri�ngulo Ret�ngulo!");
		} else if (soma > 90) {
			System.out.println("� um Tri�ngulo Obtus�ngulo");
		} else if (soma < 90) {
			System.out.println("� um Tir�ngulo Acut�ngulo");
		}
		
	}
	
}
