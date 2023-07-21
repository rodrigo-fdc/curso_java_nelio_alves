package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the numbber employee: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char question = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			sc.nextLine();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (question == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();

				Employee employee = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
				list.add(employee);
			} else {

				Employee employee = new Employee(name, hour, valuePerHour);
				list.add(employee);
			}
		}

		System.out.println("PAYMENTS");
		for (

		Employee employee : list) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}

		sc.close();

	}

}
