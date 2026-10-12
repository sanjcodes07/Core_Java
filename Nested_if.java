package first_project;

import java.util.Scanner;
//3 Nested if
public class Nested_if {

	public static void main(String[] args) {
		int age, per, pin;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter age:  ");
		age = scan.nextInt();

		System.out.println("Enter per:  ");
		per = scan.nextInt();

		System.out.println("Enter pin:  ");
		pin = scan.nextInt();

		if (age >= 18) {
			if (per >= 50) {
				System.out.println("U R Eligible");
			} else {
				if (pin == 121212) {
					System.out.println("U R Eligible");
				} else {
					System.out.println("NE : age & pin");
				}
			}

		} else {
			System.out.println("NE :age");
		}
	}
}