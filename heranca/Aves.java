package heranca;

public class Aves extends ReinoAnimal {

	private String corBico;
	private String corPena;
	
	
	@Override
	public void comunicar() {
		String comunicar = "Canto";
		this.setComunicar(comunicar);
	}
	
	@Override
	public void movimentar() {
		 String movimentar = "Voar";
		 this.setComunicar(movimentar);
	}

	public String getCorBico() {
		return corBico;
	}

	public void setCorBico(String corBico) {
		this.corBico = corBico;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public String toString() {
		return "Aves [corBico=" + corBico + ", corPena=" + corPena + ", getCorBico()=" + getCorBico()
				+ ", getCorPena()=" + getCorPena() + ", getPeso()=" + getPeso() + ", getCor()=" + getCor()
				+ ", getNome()=" + getNome() + ", getComunicar()=" + getComunicar() + ", getMovimentar()="
				+ getMovimentar() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
