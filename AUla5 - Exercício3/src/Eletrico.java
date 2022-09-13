public class Eletrico extends Dispositivo {
	private long codigo;
	private String nome;
	private Peca peca; // Composição
	private Analogico analogico;// Agregação

	public Analogico getAnalogico() {
		return analogico;
	}

	public void setAnalogico(Analogico analogico) {
		this.analogico = analogico;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Peca getPeca() {
		return peca;
	}

	public void setPeca(Peca peca) {
		this.peca = peca;
	}

}
