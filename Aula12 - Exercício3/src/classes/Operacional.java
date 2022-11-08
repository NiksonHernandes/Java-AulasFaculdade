package classes;

public class Operacional extends Funcionario{
	private int horas;
	private double valorHora;
	
	@Override
	public double calulaSalario() {
		double value = (this.getHoras() * this.getValorHora());
		return value;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
