package locais;

import inventario.Equipamento;

public class Laboratorio {
	private String nome;
	private String endereco;
	private Equipamento equipamento[];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Equipamento[] getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento[] equipamento) {
		this.equipamento = equipamento;
	}
	
}
