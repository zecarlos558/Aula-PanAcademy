package ExerciciosLacoRepeticao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("------------JOGO DA ADVINHA��O-------------");
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100);
		System.out.println(numeroAleatorio);
		int numero = 0;
		boolean game = false;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite a "+(i)+"� tentativa: ");
			numero = entrada.nextInt();
			if (numero == numeroAleatorio) {
				game = true;
				break;
			} else {
				if (numero > numeroAleatorio) {
					System.out.println("O n�mero digitado � maior que o sorteado!");
					System.out.println("N�mero de tentativas restantes: "+(10-i));
				} else {
					System.out.println("O n�mero digitado � menor que o sorteado!");
					System.out.println("N�mero de tentativas restantes: "+(10-i));
				}
			}		
			System.out.println("--------------------------------------------");
		}		
		
		if (game == true) {
			System.out.println("===================================");
			System.out.println("Parab�ns voc� acertou! WINNER!");
			System.out.println("===================================");
		} else {
			System.err.println("===================================");
			System.err.println("Voc� n�o acertou! LOSER!");
			System.err.println("===================================");
		}
		
	}
	
}
