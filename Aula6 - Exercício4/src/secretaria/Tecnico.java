package secretaria;

import academico.Disciplina;

public class Tecnico extends Disciplina{
	private long semana;
	private int credito;
	private String conteudo;
	
	public long getSemana() {
		return semana;
	}
	public void setSemana(long semana) {
		this.semana = semana;
	}
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	} 
		
}
