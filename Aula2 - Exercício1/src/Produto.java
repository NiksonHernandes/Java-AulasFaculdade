public class Produto {
	
	private long codigo;
	private String nome;
	private double preco;
	
	//setters
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//getters
	public long getCodigo() {
		return this.codigo; 
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
}
