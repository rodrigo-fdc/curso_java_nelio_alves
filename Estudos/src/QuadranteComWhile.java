import java.util.Scanner;

public class QuadranteComWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite os valores de X e Y, respectivamente: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while ( x != 0 && y != 0) {
			if (y > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if ( x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}
			System.out.println("Digite outros valores para X e Y, respectivamente: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
