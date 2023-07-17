import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
