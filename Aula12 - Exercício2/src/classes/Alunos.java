package classes;

public abstract class Alunos {
	private long ra;
	private String nome;
	
	public abstract double calcularMedia();

	public long getRa() {
		return ra;
	}

	public void setRa(long ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
