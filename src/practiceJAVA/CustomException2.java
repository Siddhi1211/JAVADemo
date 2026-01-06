package practiceJAVA;

public class CustomException2 {

	public static void ageCalculator(int age) throws CustomException {
		if (age > 18) {
			throw new CustomException("You are adult");
		}
		System.out.println("Invalid age");
	}

	public static void main(String args[]) {
		try {
			ageCalculator(15);
			System.out.println("I am inside try block");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}

	}
}
