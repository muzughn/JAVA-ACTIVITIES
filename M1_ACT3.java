package M1_Activity3;

import java.util.Scanner;

public class M1_ACT3 {

	/**
	 * @param args
	 */
	public static int Sum(int x,int y) {
		int sum = x + y;
		return sum;
	}
	
	public static int Product(int x,int y) {
		int product = x * y;
		return product;
	}
	
	public static int Difference(int x,int y) {
		int Difference = x - y;
		return Difference;
	}
	
	public static void main(String[] args) {
		
		// Create a Scanner object
			Scanner input = new Scanner(System.in);
				
		// Read user input1
			System.out.print("Enter first number: ");
			String Inpnum1 = input.nextLine();
		// Read user input2
			System.out.print("Enter second number: ");
			String Inpnum2 = input.nextLine();

		int num1 = Integer.parseInt(Inpnum1);
		int num2 = Integer.parseInt(Inpnum2);

		//Display result 
		System.out.println("Sum : "+ Sum(num1,num2));
		System.out.println("Product : " + Product(num1,num2));
		System.out.println("Difference : " + Difference(num1,num2));
	}

}
