package documentos;

import contatos.Pessoa;

public class Coletivo extends Contrato{
	private double aliquota;
	private Pessoa pessoa[];
	
	public double getAliquota() {
		return aliquota;
	}
	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	public Pessoa[] getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa[] pessoa) {
		this.pessoa = pessoa;
	}
	
}
