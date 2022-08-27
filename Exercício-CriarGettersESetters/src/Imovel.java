public class Imovel {
	private long numero;
	private String endereco;
	private String cidade;
	private double aluguel;
	
	//Setters
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}
	//Getters
	public long getNumero() {
		return this.numero;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public String getCidade() {
		return this.cidade;
	}
	public double getAluguel() {
		return this.aluguel;
	}
}
