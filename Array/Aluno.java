package Array;

public class Aluno {

	private String nome;
	private Double[] notas = new Double[5];
	
	public void aprovado() {
		Double soma = 0.0;
		for (Double nota : notas) {
			soma = soma + nota;
		}
		Double media = soma/notas.length;
		if (media >= 7.0) {
			System.out.println("=====O aluno está aprovado!=====");
		} else {
			System.out.println("=====O aluno está reprovado!=====");
		}
		
	}
	
	public void media() {
		Double soma = 0.0;
		for (Double nota : notas) {
			soma = soma + nota;
		}
		Double media = soma/notas.length;
		System.out.println("A média do aluno é: "+media);
	}
	
	public void maiorNota() {
		Double maior = 0.0;
		for (Double nota : notas) {
			if (nota > maior) {
				maior = nota;
			}
		}
		System.out.println("A maior nota é: "+maior);
	}

	public void imprimeNome() {
		System.out.println("Nome do aluno: "+nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double[] getNotas() {
		return notas;
	}

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}
		
	
}
