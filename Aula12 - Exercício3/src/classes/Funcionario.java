package classes;

public abstract class Funcionario {
	private long ctps;
	private String nome;
	
	public abstract double calulaSalario();

	public long getCtps() {
		return ctps;
	}

	public void setCtps(long ctps) {
		this.ctps = ctps;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
