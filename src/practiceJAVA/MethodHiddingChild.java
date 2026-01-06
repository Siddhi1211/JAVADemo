package practiceJAVA;

public class MethodHiddingChild extends MethodHiddingParent {

	public static void show() {
		System.out.println("It's a child class");
	}

	public static void main(String args[]) {
		System.out.println("I am child");
		MethodHiddingParent m = new MethodHiddingParent(); // Parent Method // parent
		MethodHiddingParent mh = new MethodHiddingChild(); // Method Hiding // child
		MethodHiddingChild m2 = new MethodHiddingChild(); // Child Method // child

		m.show();
		mh.show(); // Method Hiding
		m2.show();

	}
}
