import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom Dia");
		} else if (hora < 18) {
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
		
		sc.close();

	}

}
