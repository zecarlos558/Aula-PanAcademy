package heranca;

public class Mamifero extends ReinoAnimal{

	private String corPelo;
	
	@Override
	public void comunicar() {
		String comunicar = "Lingugaem de sons";
		this.setComunicar(comunicar);
	}
	
	@Override
	public void movimentar() {
		 String movimentar = "Andar";
		 this.setComunicar(movimentar);
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String toString() {
		return "Mamifero [corPelo=" + corPelo + ", getCorPelo()=" + getCorPelo() + ", getPeso()=" + getPeso()
				+ ", getCor()=" + getCor() + ", getNome()=" + getNome() + ", getComunicar()=" + getComunicar()
				+ ", getMovimentar()=" + getMovimentar() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
