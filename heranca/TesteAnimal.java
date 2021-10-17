package heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Aves ave1 = new Aves();
		ave1.setNome("Sabiá");
		ave1.setPeso(0.5);
		ave1.setCor("Amarelo");
		ave1.setCorBico("Branco");
		ave1.setCorPena("Azul");
		ave1.comunicar();
		ave1.movimentar();
		System.out.println(ave1.toString());
		
		Mamifero mamifero1 = new Mamifero();
		mamifero1.setNome("Macaco");
		mamifero1.setCor("Branco");
		mamifero1.setCorPelo("Preto");
		mamifero1.setPeso(50.0);
		mamifero1.comunicar();
		mamifero1.movimentar();
		System.out.println(mamifero1.toString());
		
	}

}
