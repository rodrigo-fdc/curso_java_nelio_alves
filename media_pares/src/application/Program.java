package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vetor = new int[n];
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		int totalPares = 0;
		int countPares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				totalPares = totalPares + vetor[i];
				countPares++;
			}
		}

		

		if (countPares > 0) {
			double mediaPares = totalPares / countPares;
			System.out.printf("Média dos pares = %.1f", mediaPares);
		} else {
			System.out.println("Nenhum número par");
		}

		sc.close();
	}

}
