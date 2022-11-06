
public class Pessoa {
	private long cpf;
	private String nome;
	private String cidade;
	
	public Pessoa(long cpf, String nome, String cidade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.cidade = cidade;
	}
	public void mostrarDados() {
		System.out.println("-----------------------------------");
		System.out.println("CPF: " + this.getCpf() + "\nNome: " + this.getNome() + "\nCidade: " + this.getCidade());
	}
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
