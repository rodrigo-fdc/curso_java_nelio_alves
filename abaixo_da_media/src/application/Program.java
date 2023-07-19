package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double totalVetor = 0.0;
		for(int i=0; i<vetor.length; i++) {
			totalVetor += vetor[i];
		}
		
		double media = totalVetor / n;
		
		System.out.printf("Media do vetor = %.3f\n", media);
		System.out.println("Elementos abaixo da media:");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] <= 10.0) {
				System.out.printf("%.1f\n",vetor[i]);
			}
		}
		
		sc.close();
	}

}
