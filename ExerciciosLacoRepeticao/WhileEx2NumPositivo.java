package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class WhileEx2NumPositivo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int total = 0;
		System.out.println("Digite o n�mero positivo ( ou n�mero negativo para finalizar ): ");
		numero = entrada.nextInt();		
		while (numero >= 0) {
			System.out.println("--------------------------------------------------------------------");
			total = total + numero;
			System.out.println("Digite o pr�ximo n�mero ( ou n�mero negativo para finalizar ): ");
			numero = entrada.nextInt();			
			
		}
		System.out.println("Soma dos n�meros positivos: "+total);
	}
	
}
