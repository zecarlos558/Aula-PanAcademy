package heranca;

public class Profissional {

	
	private String nome;
	private String email;
	private double salario;
	
	public Profissional() {
		super();		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Profissional [nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
	}
	
	
}
