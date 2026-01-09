package M3_Activity2;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class M3_Activity2 {

	public static void mainMenu() {
		System.out.println("+=====================================+");
		System.out.println("|   ACTIVITY#2 | HASHSET OPERATIONS   |");
		System.out.println("+=====================================+");
		System.out.println("| 1. SEARCH A PRODUCT                 |");
		System.out.println("| 2. ADD A PRODUCT                    |");
		System.out.println("| 3. PRINT ALL PRODUCTS AND COUNT     |");
		System.out.println("| 4. EXIT                             |");
		System.out.println("+=====================================+");
		System.out.print("ENTER YOUR CHOICE FROM (1-4) ONLY: ");
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Set<String> products = new HashSet<>();
		
		
		products.add("Lenovo");	
		products.add("Apple");
		products.add("Dell");
		products.add("HP");
		products.add("Acer");
		
		int userInp = 0;
		String productName;
		boolean isFound = false;
		
		do {
			//call mainMenu method
			mainMenu();
			try {
				userInp = input.nextInt(); 
				input.nextLine().trim();              
			}catch (InputMismatchException  e) {
				 System.out.println("INVALID CHOICE! ENTER A VALUE FROM 1 TO 4.");
				 input.nextLine().trim();
				 continue;
			}
			
			switch(userInp) {
			case 1:
				System.out.print("ENTER PRODUCT NAME TO SEARCH     : ");
				productName = input.nextLine().trim();
				for (String product : products) {
					if(product.equalsIgnoreCase(productName)) {
						isFound = true;
						break;
					}
				}
				if (isFound == true) {
					System.out.println("=======================================");
					System.out.println("PRODUCT " + productName.toUpperCase() + " FOUND!" );
					System.out.println("=======================================");
				}else {
					System.out.println("=======================================");
					System.out.println("PRODUCT " + productName.toUpperCase() + " NOT FOUND!");
					System.out.println("=======================================");
				}
				isFound = false;
				break;
				
			case 2:
				System.out.print("ENTER PRODUCT NAME TO ADD        : ");
				String addProductName = input.nextLine().trim();
				if(addProductName.isEmpty()) {
					System.out.println("=======================================");
					System.out.println("PRODUCT NAME CANNOT BE EMPTY! PLEASE ADD A PRODUCT AGAIN.");
					System.out.println("=======================================");
					break;
				}
				boolean exists = products.stream()
								 .anyMatch(p -> p.equalsIgnoreCase(addProductName));
				
				if (exists) {
					System.out.println("=======================================");
					System.out.println("PRODUCT " + addProductName.toUpperCase() + " ALREADY EXISTS.");
					System.out.println("=======================================");
				}else {
					System.out.println("=======================================");
					System.out.println("PRODUCT " + addProductName.toUpperCase() + " ADDED.");
					System.out.println("=======================================");
					products.add(addProductName);
				}
				break;
			case 3:
				System.out.println("=======================================");
				for (String product : products) {
					System.out.println(product);
				}
				System.out.println("=======================================");
				System.out.println("TOTAL UNIQUE PRODUCTS: " + products.size());
				break;
			case 4:
				System.out.println("EXITING..........");
				break;
			default:
				 System.out.println("INVALID CHOICE! ENTER A VALUE FROM 1 TO 4.");
			}
			
		}while(userInp != 4 );
		input.close();
	}
}
