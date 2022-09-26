package analise;

import desenvolvimento.Procedure;
import desenvolvimento.Funcao;

public class Programa {
	private String nome;
	private Procedure procedure[];
	private Funcao funcao[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Procedure[] getProcedure() {
		return procedure;
	}
	public void setProcedure(Procedure[] procedure) {
		this.procedure = procedure;
	}
	public Funcao[] getFuncao() {
		return funcao;
	}
	public void setFuncao(Funcao[] funcao) {
		this.funcao = funcao;
	}
	
}
