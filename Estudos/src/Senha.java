import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;

		System.out.println("Digite sua senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();

	}

}
