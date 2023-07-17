import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		int A, B, C, D, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quatro números inteiros: ");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A*B - C*D;
		
		System.out.println("DIFERENÇA = " + diferenca);
		
		sc.close();

	}

}
