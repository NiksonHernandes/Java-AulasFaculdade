public class Cupom {

	private long numero;
	private String data;
	private double total;
	private double imposto;
	
	//setters
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public void setData(String data) {
		this.data = data; 
	}
	
	public void setTotal(double total) {
		this.total = total; 
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto; 
	}
	
	//getters
	public long getNumero() {
		return this.numero;
	}
	
	public String getData() {
		return this.data;
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public double getImposto() {
		return this.imposto;
	}
}
