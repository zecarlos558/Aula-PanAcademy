package ExerciciosLacoRepeticao;

import java.util.Scanner;

public class ImprimeString {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra ;
		palavra = entrada.next();
		// palavra = JOptionPane.showInputDialog(null,"Digite uma palavra");
		System.out.println("-----Imprimindo letra por letra-----");
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println((i+1)+"° letra: "+palavra.charAt(i));
		}
		
	}
	
}
