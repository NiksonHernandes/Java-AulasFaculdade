package classes;

public class Motorista {
	private long cnh;
	private String nome;
	private Viagem viagem[];
	
	public long getCnh() {
		return cnh;
	}
	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Viagem[] getViagem() {
		return viagem;
	}
	public void setViagem(Viagem[] viagem) {
		this.viagem = viagem;
	}	
}
