
public class Caminhao {
	private String placa;
	private String marca;
	private Motorista motorista;
	private Encomenda encomenda[];
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Encomenda[] getEncomenda() {
		return encomenda;
	}
	public void setEncomenda(Encomenda[] encomenda) {
		this.encomenda = encomenda;
	}
		
}
