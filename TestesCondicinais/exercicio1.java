package TestesCondicinais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		int numero1 = entrada.nextInt();
		System.out.println("Digite o segundo n�mero");
		int numero2 = entrada.nextInt();
		System.out.println("Digite o terceiro n�mero");
		int numero3 = entrada.nextInt();
		
		if (numero1 > (numero2) && (numero1 > numero2) ) {
			System.out.println("O maior n�mero �: "+numero1);
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
		System.out.println("O maior n�mero �: "+numero2);
		} else {
			System.out.println("O maior n�mero �: "+numero3);
		}
		
		if (numero1 < (numero2) && (numero1 < numero3) ) {
			System.out.println("O menor n�mero �: "+numero1);
		} else if ((numero2 < numero1) && (numero2 < numero3)) {
		System.out.println("O menor n�mero �: "+numero2);
		} else if ((numero3 < numero1) && (numero3 < numero2)){
			System.out.println("O menor n�mero �: "+numero3);
		}
		
	}
	
}
