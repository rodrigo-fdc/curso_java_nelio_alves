import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro entre 1 e 1000:");
		int X = sc.nextInt();

		for (int i = 0; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
