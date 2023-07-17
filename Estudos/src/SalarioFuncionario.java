import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora, salario;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número do funcionário:");
		numeroFuncionario = sc.nextInt();
		
		System.out.println("Infomre a quantidade de horas trabalhadas: ");
		horasTrabalhadas = sc.nextInt();
		
		System.out.println("Informe o valor que o funcionário recebe por hora");
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("Numero: " + numeroFuncionario);
		System.out.printf("Salario: %.2f%n", salario);
		
		sc.close();

	}

}
