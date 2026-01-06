package practiceJAVA;

public class customExceptionNeha2 {

	public static void checkAge(int age) throws customExceptionNeha
	{
		if(age>12)
			throw new customExceptionNeha("Age is greater than entered number");
	}
	public static void main(String[] args) {
		try {
		checkAge(16);
		System.out.println("In try block");
		}
		catch(customExceptionNeha e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
