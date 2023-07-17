import java.util.Scanner;

public class ExercicioSoma {
	
	public static void main(String[] args) {
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		a = sc.nextInt();
		
		System.out.println("Digite outro numero inteiro");
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
