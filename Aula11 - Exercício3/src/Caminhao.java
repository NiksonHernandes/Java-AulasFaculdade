
public class Caminhao {
	private String placa;
	private int eixos;
	private Carga carga[];
	private Direcao direcao;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public Carga[] getCarga() {
		return carga;
	}
	public void setCarga(Carga[] carga) {
		this.carga = carga;
	}
	public Direcao getDirecao() {
		return direcao;
	}
	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
}
