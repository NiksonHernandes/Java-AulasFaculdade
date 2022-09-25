
public class Produtos {
	private int codigo;
	private String nome;
	private float preco;
	private Promocao promo; //Composicao
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Promocao getPromo() {
		return promo;
	}
	public void setPromo(Promocao promo) {
		this.promo = promo;
	}

}
