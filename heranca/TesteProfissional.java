package heranca;

public class TesteProfissional {

	public static void main(String[] args) {
		
		Professor professor1 = new Professor();
		
		professor1.setDisciplina("Aula de Orientação a Objetos com JAVA");
		System.out.println("Disciplina do professor 1: "+professor1.getDisciplina());
		
		professor1.setNome("Jose Carlos");
		professor1.setEmail("josecarlos@gama.com.br");
		professor1.setSalario(10);
		System.out.println(professor1.toString());
		
	}
	
}
