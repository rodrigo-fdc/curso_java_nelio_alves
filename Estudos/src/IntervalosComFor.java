import java.util.Scanner;

public class IntervalosComFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, xIn = 0, xOut = 0;
		
		System.out.println("Digite a quantidade de números que serão lidos: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Digite um número inteiro");
			int x = sc.nextInt();
			if (x >= 10 && x <= 20 ) {
				xIn += 1;
			} else {
				xOut += 1;
			}
 		}
		
		System.out.println(xIn + " in");
		System.out.println(xOut + " out");
		
		sc.close();

	}

}
