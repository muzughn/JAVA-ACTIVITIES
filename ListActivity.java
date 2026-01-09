package M3_Activity1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListActivity {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String searchProdName;
		
		List<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		//Display all products
		System.out.println("All products: ");
		for (int i=0; i < products.size();i++) {
			
			System.out.println((i + 1) + "." + products.get(i));
		}

		// Add and remove items 
		products.add("Webcam");
		products.remove("Mouse");
		
		
		System.out.println("\nAfter adding and removing products: ");
		for (int i=0; i < products.size();i++) {
		
			System.out.println((i + 1) + "." + products.get(i));
		}
		
		System.out.print("\nEnter product name to search: ");
		searchProdName = input.nextLine().trim();
		
		int isFoundIndex = -1;
		
		// search items inside for loop
		for(int i = 0; i < products.size();i++) {
			 if (products.get(i).equalsIgnoreCase(searchProdName)) {
				
				isFoundIndex = i; // zero-based index
				break;
			 }
		}

		if (isFoundIndex >= 0) { 
            System.out.println("Product \"" + products.get(isFoundIndex).toUpperCase() + "\" found at position " + (isFoundIndex + 1));
        } else {
            System.out.println("Product \"" + searchProdName.toUpperCase() + "\" not found.");
        }
		
	}

}
