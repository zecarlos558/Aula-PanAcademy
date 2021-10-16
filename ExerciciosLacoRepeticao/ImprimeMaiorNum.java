package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class ImprimeMaiorNum {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero,maior = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"° número: ");
			numero = entrada.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			System.out.println("-------------------------------");
		}
		System.out.println("O maior número digitado foi: "+maior);
	}
	
}
