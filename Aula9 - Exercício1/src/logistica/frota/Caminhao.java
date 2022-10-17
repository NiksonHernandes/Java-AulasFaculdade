package logistica.frota;

import logistica.entregas.Frete;

public class Caminhao extends Veiculo{		
	private String combustivel;
	private Frete frete;
	
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Frete getFrete() {
		return frete;
	}
	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
}
