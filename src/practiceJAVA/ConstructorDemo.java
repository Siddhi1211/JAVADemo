package practiceJAVA;

public class ConstructorDemo {

	String name;
	ConstructorDemo(String name, String add)
	{
		this.name = name;
		//this("Siddhi"); 
		System.out.println("Default constructor " + name);
	}
	
	ConstructorDemo(String s)
	{
		System.out.println("Parameterized  constructor : "+s);
	}
	
	public static void main(String[] args) {
		ConstructorDemo c= new ConstructorDemo("Siddhi", "Pune");
	}

}
