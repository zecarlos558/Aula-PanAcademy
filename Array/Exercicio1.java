package Array;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int soma = 0;
		int maior = 0;
		int menor = 1000;
		for (int vetor : array) {
			soma = soma + vetor;
			if (vetor > maior) {
				maior = vetor;
			} else if (vetor < menor) {
				menor = vetor;
			}
		}
		int media = soma / array.length;
		System.out.println("O valor total da soma dos elementos: "+soma);
		System.out.println("A média dos elementos: "+media);
		System.out.println("O maior valor: "+maior);
		System.out.println("O menor valor: "+menor);
	}

}
