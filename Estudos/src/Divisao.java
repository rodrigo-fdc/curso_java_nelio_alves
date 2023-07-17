import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		double n, divisor, dividendo, resultado;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de divisões: ");
		n = sc.nextDouble();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os valores do dividendo e do divisor respectivamente: ");
			dividendo = sc.nextDouble();
			divisor = sc.nextDouble();
			
			if (divisor == 0) {
				System.out.println("Divisão Impossível");
			} else {
				resultado = dividendo / divisor;
				System.out.printf("%.1f%n", resultado);
			}
			
			
		}
		
		
		sc.close();

	}

}
