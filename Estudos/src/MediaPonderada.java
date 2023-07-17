import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		int n;
		double valor1, valor2, valor3, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de testes que deseja fazer: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os valores:");
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
			
		}
		
		sc.close();

	}

}
