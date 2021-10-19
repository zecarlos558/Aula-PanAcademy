package Array;

import java.util.Iterator;
import java.util.Scanner;

public class CarroArray {

	public static void main(String[] args) {
		String joao = "João";
		String ana = "Ana";
		String jenifer = "Jenifer";
		String jonathan = "Jonathan";
		
		String[] carro = new String[4];
		carro[0] = joao;
		carro[1] = ana;
		carro[2] = jenifer;
		carro[3] = jonathan;
		
		System.out.println("Carro comporta: "+carro.length);
		
		for (String car : carro) {
			System.out.println(car);
		}
		Scanner entrada = new Scanner(System.in);
	}

}
