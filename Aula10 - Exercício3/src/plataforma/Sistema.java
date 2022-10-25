package plataforma;

import codigos.Programa;
import crm.Clientes;

public class Sistema {
	private String nome;
	private String descricao;
	private Programa programa[];
	private Clientes clientes[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Programa[] getPrograma() {
		return programa;
	}
	public void setPrograma(Programa[] programa) {
		this.programa = programa;
	}
	public Clientes[] getClientes() {
		return clientes;
	}
	public void setClientes(Clientes[] clientes) {
		this.clientes = clientes;
	}

}
