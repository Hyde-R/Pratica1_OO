package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, curso;
		int matricula, periodo;
		double notaAV1, notaAV2, notaAE;
		
		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Digite a matrícula: ");
		matricula = sc.nextInt();
		System.out.println("Digite a nota da AV1: ");
		notaAV1 = sc.nextDouble();
		System.out.println("Digite a nota da AV2: ");
		notaAV2 = sc.nextDouble();
		System.out.println("Digite a nota da AE: ");
		notaAE = sc.nextDouble();
		System.out.println("Digite o curso: ");
		curso = sc.nextLine();
		sc.nextLine();
		System.out.println("Digite o período: ");
		periodo = sc.nextInt();
		
		Aluno al = new Aluno(nome, matricula, notaAV1, notaAV2, notaAE, curso, periodo);
		
		System.out.println(al.avaliarAluno());
		System.out.println(al.avaliarRecuperacao(notaAE));
		
		al.alteraNotaAV1(10);
		System.out.println(al.avaliarAluno());
		sc.close();
	}

}
