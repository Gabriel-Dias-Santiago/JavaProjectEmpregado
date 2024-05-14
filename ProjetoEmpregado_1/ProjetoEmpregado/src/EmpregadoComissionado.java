
public class EmpregadoComissionado extends Empregado {
	double totalDeVendas;
	double comissao;
	
	
	public EmpregadoComissionado(String nome, long matricula, double totalDeVendas, double comissao) {
		super(nome, matricula);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}


	@Override
	public String toString() {
		return totalDeVendas +  comissao + super.toString();
	}
	
	public double calcularSalario() {
		return totalDeVendas * comissao /100;	
	}

	
	
}
