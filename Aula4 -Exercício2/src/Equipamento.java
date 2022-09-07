
public class Equipamento {
	private long codigo;
	private String descricao;
	private double preco;
	private Peca peca;	
	
	
	public Equipamento() {
		this.setCodigo(123);
		this.setDescricao("Desaiusd");
		
	}
	
	public void descr() {
		System.out.println("Código = " + this.getCodigo() + "\nDescri = " + this.getDescricao());
		this.peca.apresenta();
	}
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
	
	
}
