package M4_Activity2;

public class ATMSystem {

	static double[] accounts = {10000,15000,20000};
	public static void processWithdrawal(String accountIndex,String amountInput) {
		
		try {
			int index = Integer.parseInt(accountIndex);
			double balance = accounts[index];
			double amount = Double.parseDouble(amountInput);
			
			System.out.printf("Current balance: ₱%.2f%n", balance);
			System.out.printf("Withdrawal: ₱%.2f%n", amount);
			if(amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw " + amount + "\n");
			} else {
				accounts[index] -= amount;
				System.out.printf("New balance: ₱%.2f%n", accounts[index]);
				System.out.println("Withdrawal succesfull! \n");
			}
		}catch(NumberFormatException e){
			System.out.println("ERROR: INVALID INPUT!");
			System.out.println("ERROR: PLEASE ENTER A VALID NUMBERS.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR: ACCOUNT NOT FOUND!");
			System.out.println("ERROR: INVALID ACCOUNT INDEX!");
		}catch(Exception e){
			System.out.println("ERROR: TRANSACTION FAILED!");
		}
	}
	public static void main(String[] args) {

		
		ATMSystem atm = new ATMSystem();
		
		System.out.println("=== ATM Withdrawal System ===\n");
		System.out.println("--- Test 1: Valid Withdrawal ---"); 
		System.out.println("Account=1, Amount=5000");
		processWithdrawal("1","5000");
		
		System.out.println("\n--- Test2: Invalid Account Index ---"); 
		System.out.println("Account=abc, Amount=5000");
		processWithdrawal("abc","5000");
		
		System.out.println("\n--- Test3: Account Not Found ---"); 
		System.out.println("Account=10, Amount=5000");
		processWithdrawal("10","5000");
		
		System.out.println("\n--- Test4: Insufficient Funds ---"); 
		System.out.println("Account=1, Amount=20000");
		processWithdrawal("1","20000");
		

		System.out.println("=== All Tests Completed! ===\n");
	}

}
