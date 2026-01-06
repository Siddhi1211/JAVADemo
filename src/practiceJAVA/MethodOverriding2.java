package practiceJAVA;

public class MethodOverriding2 extends MethodOverriding {
	
	MethodOverriding2()
	{
		super();
		System.out.println("Constructor of Child class");
	}
	
	public void M1()
	{
		System.out.println("MethodOverriding using java: M2");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding2 m = new MethodOverriding2(); //child
		m.M1();
		MethodOverriding m1 = new MethodOverriding2(); // child
		m1.M1();
		MethodOverriding m2 = new MethodOverriding(); //parent
		m2.M1();
	}

}
