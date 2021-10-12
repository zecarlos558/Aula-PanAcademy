package TestesCondicinais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro ângulo: ");
		int lado1 = entrada.nextInt();
		System.out.println("Digite o segundo ângulo: ");
		int lado2 = entrada.nextInt();
		System.out.println("Digite o terceiro ângulo: ");
		int lado3 = entrada.nextInt();
		
		System.out.println("------------------------------");
		if ((lado1 == lado2) && (lado2 == lado3) ) {
			System.out.println("É um Triângulo Equilátero!");
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("É um Triângulo Isóscele!");
		} else {
			System.out.println("É um Triângulo Escaleno!");
		}
		
	}
	
}
