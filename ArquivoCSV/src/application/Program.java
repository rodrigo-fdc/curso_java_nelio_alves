package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String filePath = sc.nextLine();
		
		File sourceFile = new File(filePath);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success =new File(sourceFolderStr + "/teste_file_java").mkdir();
		
		String targetFileStr = sourceFolderStr + "/teste_file_java/summary.csv";


		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String items = br.readLine();

			while (items != null) {
				
				String[] fields = items.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));
				
				items = br.readLine();
			} try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				e.getMessage();
			}
		} catch (IOException e) {
			e.getMessage();
		}

		sc.close();

	}

}
