import java.util.Locale;
import java.util.Scanner;

public class ValorPecas {

	public static void main(String[] args) {
		
		int codigo1, codigo2, qntd1, qntd2;
		double valorUnitarioP1, valorUnitarioP2, valorTotalP1, valorTotalP2, valorTotal;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da peça 1: ");
		codigo1 = sc.nextInt();
		System.out.println("Informe a quantidade de peças: ");
		qntd1 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça1: ");
		valorUnitarioP1 = sc.nextDouble();
		
		System.out.println("Informe o código da peça 2: ");
		codigo2 = sc.nextInt();
		System.out.println("Informe a quantidade de peças: ");
		qntd2 = sc.nextInt();
		System.out.println("Informe o valor unitário da peça2: ");
		valorUnitarioP2 = sc.nextDouble();
		
		valorTotalP1 = qntd1 * valorUnitarioP1;
		valorTotalP2 = qntd2 * valorUnitarioP2;
		
		valorTotal = valorTotalP1 + valorTotalP2;
		
		
		System.out.println("EXTRATO DA COMPRA: ");
		System.out.printf("Código: %d | Quantidade: %d | Valor Unitário: %.2f | Total: %.2f%n", codigo1, qntd1, valorUnitarioP1, valorTotalP1);
		System.out.printf("Código: %d | Quantidade: %d | Valor Unitário: %.2f | Total: %.2f%n", codigo2, qntd2, valorUnitarioP2, valorTotalP2);
		System.out.printf("Valor total a pagar: %.2f%n", valorTotal);
		sc.close();

	}

}
