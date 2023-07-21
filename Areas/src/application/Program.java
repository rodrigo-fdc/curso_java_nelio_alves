package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circule;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Shape #" + i + " data:");
			System.out.print("Retangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.next());
			
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Shape retangle = new Retangle(color, width, height);
				list.add(retangle);
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Shape circule = new Circule(color, radius);
				list.add(circule);			}
			
		}
		
		
		System.out.println("SHAPE AREAS:");
		for(Shape shape: list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}
