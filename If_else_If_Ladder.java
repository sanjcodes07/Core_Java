package first_project;

import java.util.Scanner;

public class If_else_If_Ladder {

	public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
     System.out.println("enter pin");
		int pin = scan.nextInt();

		if (pin == 1234) {
			System.out.println("pune");

		} else if (pin == 3456) {
			System.out.println("delhi");

		} else if (pin == 9898) {
			System.out.println("bhopal");
		} else {
			System.out.println("not exist");
		}
	}

}
