package practiceJAVA;

public class MethodOverloadingDemo {

	void M1()
	{
		System.out.println("I am M1 ");
	}
	String M1(String s)
	{
		System.out.println("I am M1 " + s);
		return s;
	}
	void M1(int a)
	{
		System.out.println("I am M1 " + a);
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.M1();
		m.M1(10);
		m.M1("Siddhi");
	}
	public static void main(String s) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.M1();
	}

}
