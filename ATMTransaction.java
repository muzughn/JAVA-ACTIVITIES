package M4_Activity3;

public class ATMTransaction {
	public static void checkBalance(String accountNumber,double balance) {
		try {
			System.out.println("Processing Balance Inquiry....");
			char accountType = accountNumber.charAt(0);
			int newAccNum = Integer.parseInt(accountNumber);
			
			switch(accountType){
			case'1': 
				System.out.println("Account Type: Savings");
				break;
			case '2':
				System.out.println("Account Type: Checking");
				break;
			default:
				System.out.println("Account Type: Unknown");
			}
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Current Balance: " + balance);
			System.out.println("Balance Inquiry Successful!\n ");
			
		}catch(NumberFormatException e) {
			System.out.println("Error: Invalid Account Number Format! Account Number must be numeric.");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error: Account Number is empty or invalid!");
		}
		System.out.println("\n=========== RECEIPT ===========");
		System.out.println("Transaction Date: December 03, 2025");
		System.out.println("Transaction Type: Balance Inquiry");
		System.out.println("ATM Location: Main Branch");
		System.out.println("Thank you for Banking with us!");
		System.out.println("===============================\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMTransaction atm = new ATMTransaction();

		System.out.println("=======================================");
		System.out.println("ATM Balance Check with Receipt Printing");
		System.out.println("=======================================");
		checkBalance("100123456",15000.00);
		checkBalance("200987654",25000.00);
		checkBalance("ABC12345",15000.00);
		checkBalance("",15000.00);
	}

}
