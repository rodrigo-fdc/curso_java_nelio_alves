import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		int horaInicial, horaFinal, duracao;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a hora inicial do jogo: ");
		horaInicial = sc.nextInt();
		System.out.println("Informe a hora final do jogo: ");
		horaFinal = sc.nextInt();
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O jogo durou %d hora(s)", duracao);
		
		sc.close();

	}

}
