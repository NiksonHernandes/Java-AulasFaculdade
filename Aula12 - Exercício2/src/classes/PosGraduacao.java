package classes;

public class PosGraduacao extends Alunos {
	private double artigo;
	private double projeto;
	
	@Override
	public double calcularMedia() {
		double value = (this.getArtigo() * 0.4) + (this.getProjeto() * 0.6);
		return value;
	}
	
	public double getArtigo() {
		return artigo;
	}
	public void setArtigo(double artigo) {
		this.artigo = artigo;
	}
	public double getProjeto() {
		return projeto;
	}
	public void setProjeto(double projeto) {
		this.projeto = projeto;
	}

}
