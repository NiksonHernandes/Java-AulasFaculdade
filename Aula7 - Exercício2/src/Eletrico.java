public class Eletrico extends Analogico{
	private int potencia;
	private Digital componentes[];
	
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public Digital[] getComponentes() {
		return componentes;
	}
	public void setComponentes(Digital[] componentes) {
		this.componentes = componentes;
	}
	
}
