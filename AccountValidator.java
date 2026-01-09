package M4_Activity5;

public class AccountValidator {
	//Custom Class Exception for Invalid Account Number
	class InvalidAccountNumberException extends Exception {
	    public InvalidAccountNumberException(String message) {
	        super(message);
	    }
	}

	//Custom Class Exception for Invalid Account Number Format
	class InvalidAccountFormatException extends RuntimeException {
	    public InvalidAccountFormatException(String message) {
	        super(message);
	    }
	}
	//Method to Validate Account Number
	public void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException {
	
			//check account number if null throw exception
			if (accountNumber == null) {
			    throw new NullPointerException("Account number cannot be null");
			}

			//check if account number is digits only if not throw exception
			for (char c : accountNumber.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                throw new InvalidAccountFormatException("Account number must contain only digits");
	            }
			}

			//check account numbers length if != 10 throw exception
			if (accountNumber.length() != 10) {
			    throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
			}
				System.out.println("Valid account number: " + accountNumber);
	}

	//Method to test validation without repeating try-catch block
	private static void testValidation(String testName, String accountNumber, AccountValidator validator) {
	        System.out.println(testName);
	        try {
	            validator.validateAccountNumber(accountNumber);
	        } catch (InvalidAccountNumberException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (InvalidAccountFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (NullPointerException e) {
	            System.out.println("Warning: " + e.getMessage());
	        }
	        System.out.println();
	    }

public static void main(String[] args) {

	System.out.println("=== Account Number Validation Test ===");
    AccountValidator validator = new AccountValidator();

    //Test Scenarios
    testValidation("Test 1: Valid account (1234567890)", "1234567890", validator);
    testValidation("Test 2: Account Number is greater than 10 (12345678901)", "12345678901", validator);
    testValidation("Test 3: Too short (123)", "123", validator);
    testValidation("Test 4: Contains letters (1234AS890)", "1234AS890", validator);
    testValidation("Test 5: Contains space (1234 567890)", "1234 567890", validator);
    testValidation("Test 6: Null value", null, validator);

}

}
