package classes;

public class Contrato extends Documento{

	private int duracao;
	private double valor;

	@Override
	public double calculaTotal() {
		
		//return this.getValor() * this.getDuracao();
		//return this.valor * this.duracao
		
		double multi = this.getValor() * this.getDuracao();
		return multi;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
