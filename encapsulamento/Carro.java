package encapsulamento;

public class Carro implements Controlador {

	private String cor;
	private boolean ligado;
	private int ano;
	private String modelo;
	private String marca;
	private String placa;
	private int velocidade;
	
	public Carro() {
		super();		
	}
	
	public Carro(String cor, boolean ligado, int ano, String modelo, String marca, String placa, int velocidade) {
		super();
		this.cor = cor;
		this.ligado = ligado;
		this.ano = ano;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.velocidade = velocidade;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	@Override
	public void acelerar() {		
		System.out.println("Aumentando a velocidade em 5km/h");
		this.velocidade = getVelocidade() + 5;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
}
