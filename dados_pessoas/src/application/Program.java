package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for(int i=0; i<pessoa.length; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa ");
			double altura = sc.nextDouble();
			System.out.print("Gerero da " + (i+1) + "a pessoa ");
			char genero = sc.next().charAt(0);
			pessoa[i] = new Pessoa(altura, genero);
		}
		
		int countHomens = 0;
		int countMulheres = 0;
		double totalAlturaMulheres = 0;
		double mediaMulheres;
		double menorAltura = pessoa[0].getAltura();
		double maiorAltura = pessoa[0].getAltura();
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getAltura() < menorAltura ) {
				menorAltura = pessoa[i].getAltura();
			} else if (pessoa[i].getAltura() > maiorAltura) {
				maiorAltura = pessoa[i].getAltura();
			}
		}
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getGenero() == 'F') {
				totalAlturaMulheres = totalAlturaMulheres + pessoa[i].getAltura();
				countMulheres++;
			} else {
				countHomens++;
			}
		}
		
		mediaMulheres = totalAlturaMulheres/countMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f\n", mediaMulheres);
		System.out.println("Número de homens = " + countHomens);
		
		sc.close();
	}
}
