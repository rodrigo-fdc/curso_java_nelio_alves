import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, fatorial;
		
		n = sc.nextInt();
		fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial *  i;
		}
		
		System.out.println(fatorial);

		sc.close();
	}

}
