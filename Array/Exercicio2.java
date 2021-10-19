package Array;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		System.out.println("======Imprimindo números Pares======");
		for (int par : array2) {
			if (par % 2 == 0) {
				System.out.println(par);
			}
		}
		System.out.println("======Imprimindo números Ímpares vezes(*) 2======");
		for (int impar : array2) {
			if (impar % 2 != 0) {
				System.out.println(impar*2);
			}
		}
		/*
		 * Modelo feito com vetores auxiliares para guardar números pares e impares
		int[] par = new int[array2.length];
		int[] impar = new int[array2.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] % 2 == 0) {
				par[j] = array2[i];
				j = j + 1;
			} else {
				impar[k] = array2[i];
				k = k + 1;
			}
		}
		System.out.println("======Imprimindo números Pares======");
		for (int p : par) {
			System.out.println(p);
		
		}
		System.out.println("======Imprimindo números Ímpares vezes(*) 2======");
		for (int i : impar) {
			System.out.println(i*2);
		
		}
		*/
	}
	
}
