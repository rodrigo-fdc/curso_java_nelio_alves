package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		sc.nextLine();

		int[] vetorA = new int[n];

		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		int[] vetorB = new int[n];

		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		int[] vetorC = new int[n];
		
		System.out.println("Vetor resultante:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorA[i] + vetorB[i] );
		}

		sc.close();
	}

}
