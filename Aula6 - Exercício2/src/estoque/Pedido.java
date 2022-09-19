package estoque;

public class Pedido {
	private long numero;
	private String data;
	private double valor;
	private Produto produto;
	private Icms icms;
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Icms getIcms() {
		return icms;
	}
	public void setIcms(Icms icms) {
		this.icms = icms;
	}
	
}
