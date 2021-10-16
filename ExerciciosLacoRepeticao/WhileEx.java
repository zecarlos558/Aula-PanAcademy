package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			
			System.out.println("Digite a nota ( ou digitar '-1' para finalizar! ): ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				quantidadeNotas = quantidadeNotas + 1;
				total = total + nota;
			} else if (nota == -1) {
				System.out.println(".:Fim do programa:.");
			} else {
				System.out.println("Nota Inválida! Digite novamente ...");
			}
			
		}
		
		
		double media = total/quantidadeNotas;
		System.out.println("-----------------RELATÓRIO----------------");		
		System.out.println("Quantidade de notas válidas digitadas: "+quantidadeNotas);
		System.out.printf("A média das notas é: %.2f", media);
		entrada.close();	
	}
	
}
