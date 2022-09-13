public class Componente extends Acessorio {
	private long numero;
	private long estoque;
	private Componente componente; // Agrega��o
	private Peca peca; // Agrega��o

	public long getNumero() {
		return numero;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public long getEstoque() {
		return estoque;
	}

	public void setEstoque(long estoque) {
		this.estoque = estoque;
	}

	public Componente getComponente() {
		return componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}

}
