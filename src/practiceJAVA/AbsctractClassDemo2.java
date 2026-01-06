package practiceJAVA;

public class AbsctractClassDemo2 extends AbsctractClassDemo {

	@Override
	void show() {
		System.out.println("Show method of the Abstract extended class");
	}
	@Override
	void show1()
	{
		System.out.println("Show1 method of the Abstract extended class");
	}
	 public static void main(String args[])
	 {
		 AbsctractClassDemo2 ac = new AbsctractClassDemo2();
		 ac.show();
		 ac.show1();
		 ac.display();
	 }
	
}
