package entities;

public class Retangle {
	
	public double width;
	public double heigth;
	
	public double area() {
		return heigth * width;
	}
	
	
	public double perimeter() {
		return 2 * heigth + 2 * width;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2)+Math.pow(heigth, 2));
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f%n", area())
				+ "Perimeter = "
				+ String.format("%.2f%n", perimeter())
				+ "Diagonal = "
				+ String.format("%.2f", diagonal());
	}
}
