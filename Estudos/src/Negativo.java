import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Não Negativo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();

	}

}
