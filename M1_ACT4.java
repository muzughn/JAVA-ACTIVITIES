package M1_Activity4;

import java.util.Scanner;

public class M1_ACT4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Enter your age: ");
		int Inpage = input.nextInt();
		
	
		if (Inpage < 18) {
			System.out.print("Minor");
		}
		else 
			if (Inpage >= 18 && Inpage <= 59) {
			System.out.print("Adult");
		}
			else {
				System.out.print("Senior");
			}
		

	}

}
