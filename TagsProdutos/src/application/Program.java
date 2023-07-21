package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char productState = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(productState == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
			} else if (productState == 'u') {
				System.out.print("Manufacture Date: ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				Product product = new UsedProduct(name, price, manufactureDate);
				list.add(product);
			} else {
				Product product = new Product(name, price);
				list.add(product);
			}
		}
		
		System.out.println();
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();

	}

}
