package practiceJAVA;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class ExceptionHandling {
	
	public static void main(String[] args) throws Exception {
			try
		{
			System.out.println("Inside try block");
			FileInputStream fis = new FileInputStream("file.txt");
			
		}	
		catch (IOException e) 
		{ 
			e.getMessage();
			e.printStackTrace();
		}
		finally
		{
			System.out.println("I am finally block");
		}
		
	}

}
