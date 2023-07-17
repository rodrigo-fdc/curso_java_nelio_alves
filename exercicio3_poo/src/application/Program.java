package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Insira o nome do aluno e as notas dos trimestres: ");
		student.nome = sc.nextLine();
		student.notaT1 = sc.nextDouble();
		student.notaT2 = sc.nextDouble();
		student.notaT3 = sc.nextDouble();
		
		
		System.out.println(student);
		
		sc.close();

	}

}
