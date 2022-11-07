package classes;

public class NotaFiscal extends Documento{
	private double total;
	private double imposto;
	
	@Override
	public double calculaTotal() {
		
		double soma = this.getTotal() + this.getImposto();
		return soma;
	}	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
