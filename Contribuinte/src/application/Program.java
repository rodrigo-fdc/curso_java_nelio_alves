package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + "data:");
			System.out.print("Individual or company (i/c)? ");
			char question = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if (question == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				TaxPayer taxPayer = new Individual(name, anualIncome, healthExpenditures);
				list.add(taxPayer);
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				TaxPayer taxPayer = new Company(name, anualIncome, numberOfEmployees);
				list.add(taxPayer);
			}
		}
		
		double sum = 0.0;
		System.out.println("TAXES PAID:");
		for (TaxPayer t : list) {
			double tax = t.tax();
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
		
	}

}
