package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos numeros você cai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um mumero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double maiorValor = 0;
		int posicao = 0;
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] > maiorValor) {
				maiorValor = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("Maior valor = %.1f\n", maiorValor);
		System.out.println("Posição do maior valor = " + posicao);
		sc.close();
	}
}
