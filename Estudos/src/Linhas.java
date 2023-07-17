import java.util.Scanner;

public class Linhas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, quadrado, cubo;
		System.out.println("Digite um número inteiro positivo:");
		n = sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			quadrado =  (int) Math.pow(i, 2);
			cubo =  (int) Math.pow(i, 3);
			
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();

	}

}
