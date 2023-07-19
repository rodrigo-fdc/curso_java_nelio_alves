package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		
		}
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.print("Valores = ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSoma = %.1f\n", soma);
		System.out.printf("Media = %.1f\n", media);
		
		sc.close();

	}

}
