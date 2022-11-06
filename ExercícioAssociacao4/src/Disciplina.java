
public class Disciplina {
	private String sigla;
	private String nome;
	private long creditos;
	private Avaliacao avaliacao[];
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCreditos() {
		return creditos;
	}
	public void setCreditos(long creditos) {
		this.creditos = creditos;
	}
	public Avaliacao[] getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(Avaliacao[] avaliacao) {
		this.avaliacao = avaliacao;
	}

}
