import java.util.Locale;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		double x;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		x = sc.nextDouble();
		
		if (x < 0 || x > 100.00) {
			System.out.println("Fora do intervalo");
		} else if (x <= 25.00) {
			System.out.println("Intervalo [0, 25]");
		} else if (x <= 50.00) {
			System.out.println("Intervalo (25, 50]");
		} else if (x <= 75) {
			System.out.println("Intervalo (50, 75]");
		} else {
			System.out.println("Intervalo (75, 100]");
		}
		
		
		sc.close();

	}

}
