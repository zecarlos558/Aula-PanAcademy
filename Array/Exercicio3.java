package Array;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Double[] notas = {10.0, 5.0, 7.0, 9.0, 10.0};
		Aluno aluno = new Aluno();
		aluno.setNome("José Carlos");
		aluno.setNotas(notas);		
		aluno.aprovado();		
		aluno.imprimeNome();
		aluno.media();
		aluno.maiorNota();
		
	}
	
}