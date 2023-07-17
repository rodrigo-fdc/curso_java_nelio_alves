import java.util.Locale;
import java.util.Scanner;

public class ValorContaAPagar {

	public static void main(String[] args) {
		
		int codigo, qntd;
		double total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto entre 1 e 5");
		codigo = sc.nextInt();
		
		System.out.println("Digite a quantidade");
		qntd = sc.nextInt();
		
		if (codigo == 1) {
			total = qntd * 4.00;
		} else if (codigo == 2) {
			total = qntd * 4.50;
		} else if (codigo == 3) {
			total = qntd * 5.00;
		} else if (codigo == 4) {
			total = qntd * 2.00;
		} else {
			total = qntd * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		
		
		sc.close();

	}

}
