import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		
		double x, y;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os numeros dos eixos X e Y");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0) {
			System.out.println("Eixo X");
		} else if (y == 0) {
			System.out.println("Eixo Y");
		} else if (x > 0 && y > 0) {
			System.out.println("Quadrante 1");
		} else if (x > 0 && y < 0) {
			System.out.println("Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Quadrante 3");
		} else {
			System.out.println("Quadrante 4");
		}
		
		sc.close();

	}

}
