package componentes;

import inventario.Equipamento; 

public class Roteador extends Equipamento{
	private String fabricante;
	private String velocidade;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}
	
}
