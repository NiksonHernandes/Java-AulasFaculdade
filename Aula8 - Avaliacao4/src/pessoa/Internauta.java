package pessoa;

import login.Email;

public class Internauta {
	private String nome;
	private Internauta internauta;
	private Email email[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Internauta getInternauta() {
		return internauta;
	}
	public void setInternauta(Internauta internauta) {
		this.internauta = internauta;
	}
	public Email[] getEmail() {
		return email;
	}
	public void setEmail(Email[] email) {
		this.email = email;
	}
	
}
