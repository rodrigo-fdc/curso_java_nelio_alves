package entities;

public class Student {

	public String nome;
	public double notaT1;
	public double notaT2;
	public double notaT3;
	
	public double finalGrade() {
		return notaT1 + notaT2 + notaT3;
	}
	
	public double missingPoints() {
		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		} else {
			return 0.0;
		}
	}
	
	public String toString() {
		if (finalGrade() < 60.00) {
			return "FINAL GRADE = "
					+ String.format("%.2f%n", finalGrade())
					+ "FAILED"
					+ String.format("%n")
					+ "MISSING "
					+ missingPoints()
					+ " POINTS";
		} else {
			return "FINAL GRADE = "
					+ String.format("%.2f%n", finalGrade())
					+ "PASS";
		}
	}
}
