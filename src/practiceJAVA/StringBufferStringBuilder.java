package practiceJAVA;

public class StringBufferStringBuilder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Siddhi"); //heap
		String s2 = new String("Siddhi"); //heap
		String s3 = "Siddhi"; //scp
		String s4 = "Siddhi"; //scp
		//s3=s3.concat(s4);
		
		System.out.println(s3.concat(s4));
		System.out.println("s3: "+s3);
		

		System.out.println(s1.concat(s2));
		System.out.println("s1: "+s1);
		
		if(s1.equals(s2))
		{
		System.out.println("s1 equals s2");
		}else
			System.out.println("s1 not equals s2");
		
		if(s1==s2)
		{
			System.out.println("s1==s2");
		}else
			System.out.println("s1!=s2");
		
		if(s3.equals(s4))
		{
		System.out.println("s3 equals s4");
		}else
			System.out.println("s3 not equals s4");
		
		if(s3==s4)
		{
			System.out.println("s3==s4");
		}else
			System.out.println("s3!=s4");
	
	String s = "Siddhi";
	StringBuilder str = new StringBuilder().reverse();
	System.out.println(str);
	}
}
