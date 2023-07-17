
public class Bascara {

	public static void main(String[] args) {
		
		double x1, x2, b, a, c, delta;
		
		a = 1.0;
		b = 4.0;
		c = -21.0;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

		System.out.println("O valor de x1 = " + x1);
		System.out.println("O valor de x2 = " + x2);
	}

}
