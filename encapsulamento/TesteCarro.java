package encapsulamento;

public class TesteCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.setCor("Prata");
		carro1.setPlaca("abc-123");
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		System.out.println("Cor do carro 1: "+carro1.getCor());				
		System.out.println("Placa do carro 1: "+carro1.getPlaca());
		System.out.println("Velocidade do carro 1: "+carro1.getVelocidade());
		
		Carro carro2 = new Carro();
		
		carro2.setPlaca("def-456");
		System.out.println("Placa do carro 2: "+carro2.getPlaca());
		
	}

}
