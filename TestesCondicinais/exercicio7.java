package TestesCondicinais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro �ngulo: ");
		int lado1 = entrada.nextInt();
		System.out.println("Digite o segundo �ngulo: ");
		int lado2 = entrada.nextInt();
		System.out.println("Digite o terceiro �ngulo: ");
		int lado3 = entrada.nextInt();
		
		System.out.println("------------------------------");
		if ((lado1 == lado2) && (lado2 == lado3) ) {
			System.out.println("� um Tri�ngulo Equil�tero!");
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			System.out.println("� um Tri�ngulo Is�scele!");
		} else {
			System.out.println("� um Tri�ngulo Escaleno!");
		}
		
	}
	
}
