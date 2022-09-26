public class Imovel {
	private String endereco;
	private Locatario locatario;
	private Proposta proposta[];
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Locatario getLocatario() {
		return locatario;
	}
	public void setLocatario(Locatario locatario) {
		this.locatario = locatario;
	}
	public Proposta[] getProposta() {
		return proposta;
	}
	public void setProposta(Proposta[] proposta) {
		this.proposta = proposta;
	}
	
}
