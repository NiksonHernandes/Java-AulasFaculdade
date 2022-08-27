
public class Local {
	private long id;
	private String rua;
	private String cidade;
	
	//setters
	public void setId(long id) {
		this.id = id;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public void setCidade(String cidade) {
		this.cidade= cidade;
	}
	
	//getters
	public long getId() {
		return this.id;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public String getCidade() {
		return this.cidade;
	}
}
