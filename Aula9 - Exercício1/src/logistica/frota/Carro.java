package logistica.frota;

import logistica.entregas.Encomenda;

public class Carro extends Veiculo{
	private String combustivel;
	private Encomenda encomendenda[];
	
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Encomenda[] getEncomendenda() {
		return encomendenda;
	}
	public void setEncomendenda(Encomenda[] encomendenda) {
		this.encomendenda = encomendenda;
	}
	
}
