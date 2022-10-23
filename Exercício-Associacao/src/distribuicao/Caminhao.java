package distribuicao;

import frota.Veiculo;

public class Caminhao extends Veiculo{
	private double tara;
	private Carga carga;
	
	public double getTara() {
		return tara;
	}
	public void setTara(double tara) {
		this.tara = tara;
	}
	public Carga getCarga() {
		return carga;
	}
	public void setCarga(Carga carga) {
		this.carga = carga;
	}
}
