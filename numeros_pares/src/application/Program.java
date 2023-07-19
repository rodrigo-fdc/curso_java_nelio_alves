package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Quantos números você vai digitar:");
		n = sc.nextInt();
		sc.nextLine();
		
		int[] vetor = new int[n];
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("\n");
		int qntdPares = 0;
		System.out.println("Números Pares");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
				qntdPares++;
			}
		}
		System.out.println("\n");
		System.out.println("Quantidade de pares = " + qntdPares);
		
		
		sc.close();		
	}
}
