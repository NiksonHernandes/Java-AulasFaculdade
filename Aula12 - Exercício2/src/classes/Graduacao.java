package classes;

public class Graduacao extends Alunos{
	
	private double prova;
	private double trabalho;
	private double tcc;

	
	@Override
	public double calcularMedia() {
		double value = (this.getProva() * 0.3) + (this.getTrabalho() * 0.2) + 
				(this.getTcc() * 0.5);
		return value;
	}
	
	public double getProva() {
		return prova;
	}
	public void setProva(double prova) {
		this.prova = prova;
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	public double getTcc() {
		return tcc;
	}
	public void setTcc(double tcc) {
		this.tcc = tcc;
	}
	
}
