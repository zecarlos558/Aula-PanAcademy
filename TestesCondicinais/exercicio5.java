package TestesCondicinais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro ângulo: ");
		int lado1 = entrada.nextInt();
		System.out.println("Digite o segundo ângulo: ");
		int lado2 = entrada.nextInt();
		System.out.println("Digite o terceiro ângulo: ");
		int lado3 = entrada.nextInt();
		int soma = lado1+lado2+lado3;
		System.out.println("------------------------------");
		if (soma == 90) {
			System.out.println("É um Triângulo Retângulo!");
		} else if (soma > 90) {
			System.out.println("É um Triângulo Obtusângulo");
		} else if (soma < 90) {
			System.out.println("É um Tirângulo Acutângulo");
		}
		
	}
	
}
