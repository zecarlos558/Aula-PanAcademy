package TestesCondicinais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos lados tem o triângulo:");
		int numeroLado = entrada.nextInt();
		
		if (numeroLado < 3) {
			System.out.println("NÃO É UM POLÍGONO!");
		} else {
			System.out.println("POLÍGONO NÃO IDENTIFICADO!");
		}
		
		/*
		int ladoTriangulo = 0;
		int somaLados = 0;
		int qtdLados = 0;
		int confirma = 0;
		
		do {
			ladoTriangulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ângulo do triângulo"));
			confirma = JOptionPane.showConfirmDialog(null, "Continua?");
			qtdLados = qtdLados + 1;
			somaLados = ladoTriangulo + somaLados;
		} while (confirma == JOptionPane.YES_OPTION);
		
		if (somaLados < 3) {
			JOptionPane.showMessageDialog(null, "NÃO É UM POLÍGONO!");
			System.out.println("NÃO É UM POLÍGONO!");
		} else {
			JOptionPane.showMessageDialog(null, "POLÍGONO NÃO IDENTIFICADO!");
			System.out.println("POLÍGONO NÃO IDENTIFICADO!");
		}
		
		if (somaLados == 90) {
			JOptionPane.showMessageDialog(null, "É um Triângulo Retângulo!");
			System.out.println("É um Triângulo Retângulo!");
		} else if (somaLados > 90) {
			JOptionPane.showMessageDialog(null, "É um Triângulo Obtusângulo!");
			System.out.println("É um Triângulo Obtusângulo!");
		} else if (somaLados < 90) {
			JOptionPane.showMessageDialog(null, "É um Tirângulo Acutângulo!");
			System.out.println("É um Tirângulo Acutângulo!");
		}
		*/
	}
	
}
