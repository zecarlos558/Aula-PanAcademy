package TestesCondicinais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos lados tem o tri�ngulo:");
		int numeroLado = entrada.nextInt();
		
		if (numeroLado < 3) {
			System.out.println("N�O � UM POL�GONO!");
		} else {
			System.out.println("POL�GONO N�O IDENTIFICADO!");
		}
		
		/*
		int ladoTriangulo = 0;
		int somaLados = 0;
		int qtdLados = 0;
		int confirma = 0;
		
		do {
			ladoTriangulo = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o �ngulo do tri�ngulo"));
			confirma = JOptionPane.showConfirmDialog(null, "Continua?");
			qtdLados = qtdLados + 1;
			somaLados = ladoTriangulo + somaLados;
		} while (confirma == JOptionPane.YES_OPTION);
		
		if (somaLados < 3) {
			JOptionPane.showMessageDialog(null, "N�O � UM POL�GONO!");
			System.out.println("N�O � UM POL�GONO!");
		} else {
			JOptionPane.showMessageDialog(null, "POL�GONO N�O IDENTIFICADO!");
			System.out.println("POL�GONO N�O IDENTIFICADO!");
		}
		
		if (somaLados == 90) {
			JOptionPane.showMessageDialog(null, "� um Tri�ngulo Ret�ngulo!");
			System.out.println("� um Tri�ngulo Ret�ngulo!");
		} else if (somaLados > 90) {
			JOptionPane.showMessageDialog(null, "� um Tri�ngulo Obtus�ngulo!");
			System.out.println("� um Tri�ngulo Obtus�ngulo!");
		} else if (somaLados < 90) {
			JOptionPane.showMessageDialog(null, "� um Tir�ngulo Acut�ngulo!");
			System.out.println("� um Tir�ngulo Acut�ngulo!");
		}
		*/
	}
	
}
