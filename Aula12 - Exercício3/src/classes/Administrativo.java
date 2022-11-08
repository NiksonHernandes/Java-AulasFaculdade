package classes;

public class Administrativo extends Funcionario{
	private double salario;
	private double extra;
	
	@Override
	public double calulaSalario() {
		double value = this.getSalario() + this.getExtra();
		return value;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getExtra() {
		return extra;
	}
	public void setExtra(double extra) {
		this.extra = extra;
	}
	
}
