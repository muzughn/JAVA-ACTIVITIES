package M1_Activity2;

import java.util.Scanner;

public class M1_ACT2 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Read user input
		System.out.print("Enter your age: ");
		String Inpage = input.nextLine();
		
	
		int Intage = Integer.parseInt(Inpage);
		double Doubleage = Double.parseDouble(Inpage);
		
		//Display output 
		System.out.println("Your age as int: " + Intage);
		System.out.println("Your age as double: " + Doubleage);
		
	
		
	}

}
