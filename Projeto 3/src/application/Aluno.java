package application;

public class Aluno {
	private String nome;
	private int matricula;
	private double notaAV1;
	private double notaAV2;
	private double notaAE;
	private String curso;
	private int periodo;
	
	public Aluno(String nome, int matricula, double notaAV1, double notaAV2, double notaAE, String curso, int periodo) {
		this.nome = nome;
		this.matricula = matricula;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}
	
	public void alteraNotaAV1(double novaNota) {
		notaAV1 = novaNota;
	}
	
	public void alteraNotaAV2(double novaNota) {
		notaAV2 = novaNota;
	}
	
	public void alteraNotaAE(double novaNota) {
		notaAE = novaNota;
	}
	
	public String avaliarAluno() {
		if(notaAV1 + notaAV2 >= 60) {
			return "aprovado!";
		}
		else {
			return "reprovado!";
		}
	}
	
	public String avaliarRecuperacao(double notaAE) {
		if(notaAV1 + notaAV2 >=60) {
			return "não foi necessária recuperação!";
		}
		else if((notaAV1 + notaAV2 + notaAE) / 3 >= 60) {
			return "aprovado na recuperação!";
		}
		else {
			 return "reprovado na recuperação!";
		}
	}
	
}
