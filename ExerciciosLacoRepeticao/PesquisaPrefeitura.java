package ExerciciosLacoRepeticao;

import java.util.Random;
import java.util.Scanner;

public class PesquisaPrefeitura {

	public static void main(String[] args) {
		
		double salario [] = new double[20];
		int qtdFilho [] = new int[20];
		int i = 0;
		Scanner entrada = new Scanner(System.in);
		/*
		while(i<salario.length) {
			System.out.println("Digite seu salario: ");
			salario[i] = entrada.nextDouble();
			System.out.println("Digite quantos filhos tem: ");
			qtdFilho[i] = entrada.nextInt();
			i = i + 1;
			System.out.println("----------------------------------");
		}
		*/
		Random random = new Random();		
		while (i<salario.length) {
			salario[i] = random.nextInt(4000);
			qtdFilho[i] = random.nextInt(10);
			i = i + 1;
		}
		
		int somaFilho = 0;
		for (int j : qtdFilho) {
			somaFilho = somaFilho + j;
		}
		
		double somaSalario = 0;
		int qtdBaixoSalario = 0;
		double maiorSalario = 0;
		
		for (double j : salario) {
			somaSalario = somaSalario + j;
			if (j <= 100) {
				qtdBaixoSalario = qtdBaixoSalario + 1;
			}
			if (j > maiorSalario) {
				maiorSalario = j;
			}
		}
		
		int totalSalarios = salario.length;
		int totalQtdFilhos = qtdFilho.length;
		double mediaSalario = somaSalario/totalSalarios;
		double mediaFilhos = somaFilho/totalQtdFilhos;
		double percentualSalario = (qtdBaixoSalario*100)/salario.length;
		
		
		System.out.println("=========================RELAT�RIO========================");
		System.out.println("A m�dia do sal�rio da popula��o �: "+mediaSalario);
		System.out.println("A m�dia do n�mero de filhos �: "+mediaFilhos);
		System.out.println("O maior sal�rio da popula��o �: "+maiorSalario);
		System.out.println("O percentual de pessoas com sal�rio at� 100R$ �: "+percentualSalario+"%");
		
	}
	
}
