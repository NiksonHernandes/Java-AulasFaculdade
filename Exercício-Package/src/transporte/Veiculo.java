package transporte;

public class Veiculo {
	private String placa;
	private int ano;
	private Acessorio acessorio;
	private Registro registro;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Acessorio getAcessorio() {
		return acessorio;
	}
	public void setAcessorio(Acessorio acessorio) {
		this.acessorio = acessorio;
	}
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
}
