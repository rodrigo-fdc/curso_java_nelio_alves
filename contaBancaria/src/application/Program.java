package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Enter account number: ");
		int numero = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		} else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("Account data:");
		System.out.println(conta.toString());
		

		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println(conta.toString());
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println(conta.toString());

		
		
		
		sc.close();
	}

}
