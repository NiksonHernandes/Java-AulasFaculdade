
public class Principal {
	Disciplina d1, d2, d3;
	Professor p1, p2;
	public void entraDados(){
		d1 = new Disciplina();
		d1.setSigla("N.A");
		d1.setNome("Norte American Disciplina");
		d1.setCarga(23);
		
		d2 = new Disciplina();
		d2.setSigla("MTM");
		d2.setNome("Matemática");
		d2.setCarga(15);
		
		d3 = new Disciplina();
		d3.setSigla("PT");
		d3.setNome("Portugues");
		d3.setCarga(15);
		
		p1 = new Professor();
		p1.setNome("Marcus");
		p1.setTitulacao("Doutor");
		p1.setSalario(10.3d);
		
		p2 = new Professor();
		p2.setNome("Santo");
		p2.setTitulacao("Aluno do CPS");
		p2.setSalario(5.3d);
	}
	
	public void mostraDados() {
		
		System.out.println("-------------------------------");
		System.out.println("Sigla: " + d1.getSigla());
		System.out.println("Nome: " + d1.getNome());
		System.out.println("Carga: " + d1.getCarga());
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Titulacao: " + p1.getTitulacao());
		System.out.println("Salario: " + p1.getSalario());
		System.out.println("-------------------------------");
		
		System.out.println("-------------------------------");
		System.out.println("Sigla: " + d2.getSigla());
		System.out.println("Nome: " + d2.getNome());
		System.out.println("Carga: " + d2.getCarga());
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Titulacao: " + p2.getTitulacao());
		System.out.println("Salario: " + p2.getSalario());
		System.out.println("-------------------------------");
		
		
		System.out.println("-------------------------------");
		System.out.println("Sigla: " + d3.getSigla());
		System.out.println("Nome: " + d3.getNome());
		System.out.println("Carga: " + d3.getCarga());
		System.out.println("-------------------------------");
	}
	
		
	public static void main(String[] args) {
		Principal programa =  new Principal();
		programa.entraDados();
		programa.mostraDados();

	}

}
