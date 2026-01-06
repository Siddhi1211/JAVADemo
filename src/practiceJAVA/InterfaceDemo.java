package practiceJAVA;

interface InterfaceDemo {
	default void M1() {
		System.out.println("I am I1 method inside the interface");
	}

	default void I2() {
		System.out.println("I am I2 method inside the interface");
	}

	default void I3() {
		System.out.println("I am I3 method inside the interface");
	}

	default void I4() {
		System.out.println("I am I4 method inside the interface");
	}
}
