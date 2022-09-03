public class Equipamento {
	private long numero;
	private String descricao;
	private double preco;
	
	
	//setters
	public void setNumero(long n) {
		this.numero = n; 
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//getters
	public long getNumero() {
		return this.numero;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	
	
}
