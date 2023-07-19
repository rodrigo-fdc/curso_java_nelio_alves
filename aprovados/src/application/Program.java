package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Quantos alunos serão digitados: ");
		n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		double[] nota1S = new double[n];
		double[] nota2S = new double[n];
		double soma;
		double[] media = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno");
			nome[i] = sc.nextLine();
			nota1S[i] = sc.nextDouble();
			nota2S[i] = sc.nextDouble();
			soma = nota1S[i] + nota2S[i];
			media[i] = soma/2;
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i=0; i<n; i++) {
			if(media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
