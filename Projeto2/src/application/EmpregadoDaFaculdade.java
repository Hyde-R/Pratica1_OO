package application;

public class EmpregadoDaFaculdade {
	
	private String nome;
	private double salario;
	private int horasAula;

	double getGastos() {
		return this.salario + 40.00 * horasAula;
	}

	String getInfo(){
	return "nome: " + this.nome + " com salário " + getGastos();
	}
}
