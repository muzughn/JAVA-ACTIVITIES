package M3_Activity3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class ProductsMap {
	public static void mainMenu() {
		System.out.println("+=====================================+");
		System.out.println("|   ACTIVITY#3 |   MAP OPERATIONS     |");
		System.out.println("+=====================================+");
		System.out.println("| 1. SEARCH A PRODUCT                 |");
		System.out.println("| 2. ADD A PRODUCT                    |");
		System.out.println("| 3. PRINT ALL PRODUCTS AND PRICES    |");
		System.out.println("| 4. FIND THE CHEAPEST PRODUCTS       |");
		System.out.println("| 5. EXIT                             |");
		System.out.println("+=====================================+");
		System.out.print("ENTER YOUR CHOICE FROM (1-5) ONLY: ");
	}
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		
		//Create a TreeMap with Product Name as Key and Product Price as Value
		Map<String, Integer> productsMap = new TreeMap<>();
		
		//Instantiate products
		productsMap.put("Apple",25000);
		productsMap.put("Microsoft",23000);
		productsMap.put("Asus",22000);
		productsMap.put("Acer",20000);
		productsMap.put("Lenovo",15000);
		
		
		int userInp = 0;
		String productName;
		
		do {
			//call mainMenu method
			mainMenu();
			try {
				userInp = input.nextInt(); 
				input.nextLine().trim();              
			}catch (InputMismatchException  e) {
				 System.out.println("INVALID CHOICE! ENTER A VALUE FROM 1 TO 5.");
				 input.nextLine().trim();
				 continue;
			}
			
			switch(userInp) {
			case 1:
				System.out.print("ENTER PRODUCT NAME TO SEARCH: ");
				productName = input.nextLine().trim();
				if(productsMap.containsKey(productName)) {
					System.out.println("PRODUCT FOUND!");
					System.out.println("PRICE: " + productsMap.get(productName));
				}else {
					System.out.println("PRODUCT NOT FOUND! ");
				}
				break;
			case 2:
				System.out.print("ENTER PRODUCT NAME TO ADD: ");
				String addProductName = input.nextLine().trim();
				System.out.print("ENTER PRODUCT PRICE: ");
				int addProductPrice = input.nextInt();
				
				System.out.println("PRODUCT ADDED: " + addProductName + " - " + addProductPrice);
				productsMap.put(addProductName,addProductPrice);
				break;
			case 3:
				for(Map.Entry<String, Integer> entry: productsMap.entrySet()) {
					System.out.println(entry.getKey() + " - " + entry.getValue());
				}
					System.out.println("TOTAL UNIQUE PRODUCTS: " + productsMap.size());
				break;
			case 4:

				// Find the minimum price
				    int minPrice = Integer.MAX_VALUE;
				    for (int price : productsMap.values()) {
				        if (price < minPrice) {
				            minPrice = price;
				        }
				    }
				// Print all products with the minimum price (in case of ties)
			    System.out.println("CHEAPEST PRODUCT(s):");
			    for (Map.Entry<String, Integer> entry : productsMap.entrySet()) {
			        if (entry.getValue() == minPrice) {
			            System.out.println(" - " + entry.getKey() + " : " + entry.getValue());
			        }
			    }

				break;
			case 5:
				System.out.println("EXITING..........");
				break;
			default:
				 System.out.println("INVALID CHOICE! ENTER A VALUE FROM 1 TO 5.");
			}
			
	}while(userInp != 5 );
		input.close();
}
}
