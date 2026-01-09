package M4_Activity1;

public class BankAccount {

	public static String getAccountName(String accountNumber ){
		
	/**accountNumber = "ACC-001";**/
		if(accountNumber == "ACC-001"){
			return "Juan Dela Cruz";	
		} else if (accountNumber == "ACC-002"){
			return "Marian Santos";	
		} else {
			return null;
		}
	}
	
	public static void testCase(String accountNumber) {
		System.out.print("Looking up account : " + accountNumber + "\n");
		try {
			String name = getAccountName(accountNumber);
			String upperName = name.toUpperCase();
			System.out.println("Account Holder: " + upperName +"\n");
;
			}catch(NullPointerException e){
				System.out.println("Error: Account not found!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount bankAcc = new BankAccount();
		System.out.println("=== Bank Account Name Display ===\n");
		bankAcc.testCase("ACC-001");
		bankAcc.testCase("ACC-999");
		System.out.println("\n=== Program Completed Successfully! ===\n");
	}

}
