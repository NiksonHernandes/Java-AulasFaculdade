
public class Peca {
	private long numero;
	private String nome;
	private String especificacao;
	
	public Peca(){

		this.setNome("HJoa�o");
	}
		
	public void apresenta() {
		System.out.println("O nome �: " + this.getNome());
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	
	
}
