
public abstract class Empregado {
	protected String nome;
	protected long matricula;
	
	public abstract double calcularSalario();
		
	public Empregado(String nome, long matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return nome + " " + matricula;
	}
	
}
