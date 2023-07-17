import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		int A, B;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois número inteiros");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}
		
		
		sc.close();

	}

}
