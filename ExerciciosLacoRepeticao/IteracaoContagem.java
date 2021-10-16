package ExerciciosLacoRepeticao;

public class IteracaoContagem {

	public static void main(String[] args) {
		
		int i = 233;
		while (i < 456) {
			System.out.println("Número: "+i);
			if (i >= 300 && i <= 400) {
				i = i + 3;
			} else {
				i = i + 5;
			}
			
		}
		
	}
	
}
