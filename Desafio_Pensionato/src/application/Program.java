package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Estudante[] quarto = new Estudante[10];
		
		int n;
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		sc.nextLine();
		
		Estudante[] estudante = new Estudante[n];
		
		for(int i=0; i<estudante.length; i++) {
			System.out.println("Rent #" + (i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numeroQuarto = sc.nextInt();
			sc.nextLine();
			
			estudante[i] = new Estudante(nome, email);
			quarto[numeroQuarto] = estudante[i];

		}
		
		System.out.println("Busy rooms:");
		for(int i=0; i<quarto.length; i++) {
			if(quarto[i] != null) {
				System.out.println(i + ": " + quarto[i]);
			}
				
		}
		
		
		
		
		sc.close();
	}

}
