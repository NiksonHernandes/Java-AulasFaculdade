package logistica.entregas;

import comercial.crm.Cliente;

public class Encomenda {
	private int eixos;
	private Cliente cliente;
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
