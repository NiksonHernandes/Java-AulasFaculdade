package componentes.midias;

import comunidade.usuarios.*;

public class Site {
	private String url;
	private int acessos;
	private Formulario formulario[];
	private Internauta visitante[];
	private Internauta assinante[];
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getAcessos() {
		return acessos;
	}
	public void setAcessos(int acessos) {
		this.acessos = acessos;
	}
	public Formulario[] getFormulario() {
		return formulario;
	}
	public void setFormulario(Formulario[] formulario) {
		this.formulario = formulario;
	}
	public Internauta[] getVisitante() {
		return visitante;
	}
	public void setVisitante(Internauta[] visitante) {
		this.visitante = visitante;
	}
	public Internauta[] getAssinante() {
		return assinante;
	}
	public void setAssinante(Internauta[] assinante) {
		this.assinante = assinante;
	}
}
