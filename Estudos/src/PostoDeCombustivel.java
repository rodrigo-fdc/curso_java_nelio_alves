import java.util.Scanner;

public class PostoDeCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigoCombustivel, qntdAlcool = 0, qntdGasolina = 0, qntdDiesel = 0;
		
		System.out.println("Informe o Código do Combustível: ");
		codigoCombustivel = sc.nextInt();
		
		
		while (codigoCombustivel != 4 ) {
			if (codigoCombustivel == 1) {
				qntdAlcool += 1;
			} else if (codigoCombustivel == 2) {
				qntdGasolina +=1;
			} else if (codigoCombustivel == 3) {
				qntdDiesel += 1;
			} else {
				System.out.println("Código Inválido!");
			}
			System.out.println("Informe o Código do Combustível: ");
			codigoCombustivel = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + qntdAlcool);
		System.out.println("Gasolina: " + qntdGasolina);
		System.out.println("Diesel: " + qntdDiesel);
		
		sc.close();
	}

}
