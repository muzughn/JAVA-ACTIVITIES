package M4_Activity4;

public class AccountValidator {

	public static void validateAccountNumber(String accountNumber) throws Exception {
		
			if (accountNumber == null) {
				throw new NullPointerException("Account Number cannot be null!");
			} else if (accountNumber.length() != 10) {
				throw new ArithmeticException("Must be 10 digits.");
			} else {
				System.out.println("Valid Account: " + accountNumber);
			}
	}
	public static void main(String[] args) throws Exception {
		
		AccountValidator validator = new AccountValidator();

		try {
			validator.validateAccountNumber("1234567890");
		}catch(Exception e){
			e.getMessage();
		}
		
		try {
			validator.validateAccountNumber("123");
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
		try {
			validator.validateAccountNumber(null);
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
