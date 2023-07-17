import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
		
		double PI = 3.14159;
		double raio, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valo do raio: ");
		raio = sc.nextDouble();
		
		area = PI * Math.pow(raio, 2.0);
		
		System.out.printf("Área = %.4f%n", area);
		
		sc.close();
	}

}
