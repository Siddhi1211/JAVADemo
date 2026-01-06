package practiceJAVA;

public class StaticDemo {

	static {
		System.out.println("I am static block");
	}
	static int a=10;
	
	static void m1()
	{
	System.out.println(a);
	}
	void m2()
	{
		System.out.println(a);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StaticDemo s = new StaticDemo();
		String s1 = "Sidhdi";
		StringBuilder b = new StringBuilder().reverse();
		System.out.println();
		m1();
		//s.m2();
	}

}
