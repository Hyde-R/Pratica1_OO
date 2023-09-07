package application;

public class Main {

	public static void main(String[] args) {
		EmpregadoDaFaculdade edf = new EmpregadoDaFaculdade();
		
		System.out.println("Gastos: " + edf.getGastos() + " | Infos: " + edf.getInfo());
	}

}
