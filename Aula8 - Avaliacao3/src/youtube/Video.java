package youtube;

import usuario.Algoritmo;

public class Video {
	private String conteudo;
	private Video video[];
	private Algoritmo algoritmo;
	
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Video[] getVideo() {
		return video;
	}
	public void setVideo(Video[] video) {
		this.video = video;
	}
	public Algoritmo getAlgoritmo() {
		return algoritmo;
	}
	public void setAlgoritmo(Algoritmo algoritmo) {
		this.algoritmo = algoritmo;
	}	
}
