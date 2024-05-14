
public class Main {

	public static void main(String[] args) {
		
		
		Empregado em[] = new Empregado[4];
		
		em [0] = new EmpregadoHorista("empregado1", 100, 160, 250);
		em [1] = new EmpregadoComissionado("empregado2", 4343, 523, 733);
		em [2] = new EmpregadoHorista("empregado3", 101, 161, 251);
		em [3] = new EmpregadoComissionado("empregado4", 4343, 523, 733);
		
		for (Empregado i : em) {
			System.out.println(i + " ");
			System.out.println(" salario -----> " + i.calcularSalario());
		}	
		
	}

}
