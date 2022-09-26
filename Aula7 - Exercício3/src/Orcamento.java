public class Orcamento {
	private long numero;
	private double desconto;
	private Peca peca[];
	private MaoDeObra maodeobra;
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public Peca[] getPeca() {
		return peca;
	}
	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}
	public MaoDeObra getMaodeobra() {
		return maodeobra;
	}
	public void setMaodeobra(MaoDeObra maodeobra) {
		this.maodeobra = maodeobra;
	}
	
}
