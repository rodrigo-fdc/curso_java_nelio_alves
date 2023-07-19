package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas serão digitadas: ");
		n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i=0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double somaAltura = 0.0;
		for (int i=0; i<pessoa.length; i++) {
			somaAltura += pessoa[1].getAltura();
		}
		
		double alturaMedia = somaAltura / n;

		
		int menoresDeIdade = 0;
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				menoresDeIdade++;
			}
		}
		
		double percentualMenores = ((double) menoresDeIdade / n) * 100.0;
		
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos:  %.1f%%\n", percentualMenores);
		for (int i=0; i<pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		
		sc.close();

	}

}
