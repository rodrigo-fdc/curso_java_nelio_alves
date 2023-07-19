package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maiorIdade = 0;
		int posicao = 0;
		for(int i=0; i<n; i++) {
			if(maiorIdade < idade[i]) {
				maiorIdade = idade[i];
				posicao = i;
			}
		}
		
		System.out.print("Pessoa mais velha: " + nome[posicao]);
		sc.close();

	}

}
