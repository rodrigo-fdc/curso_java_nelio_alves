import java.util.Locale;
import java.util.Scanner;

public class CalculoAreas {

	public static void main(String[] args) {
		
		double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, PI = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três valores para calcular as áreas: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//Area do Triangulo
		
		areaTriangulo = A*C/2;
		
		//Area do Ciruclo
		
		areaCirculo = PI * Math.pow(C, 2.0);
		
		//Area do Trapezio
		
		areaTrapezio = (A + B) * C /2;
		
		//Area do Quadrado
		
		areaQuadrado = Math.pow(B, 2.0);
		
		//Area do Retangulo
		
		areaRetangulo = A * B;
		
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapezio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f%n", areaRetangulo);
		
		sc.close();

	}

}
