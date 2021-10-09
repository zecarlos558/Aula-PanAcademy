package TestesCondicinais;

public class impostoDeRenda {

	public static void main(String[] args) {
		
		double salario = 3400;
		if (salario < 2500) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até 350");
		}
	
		if (salario < 3800) {
			System.out.println("Sua aliquota é de 23%");
			System.out.println("Você pode deduzir até 630");
		}
		
	}
	
}
