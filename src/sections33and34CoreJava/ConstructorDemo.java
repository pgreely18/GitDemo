package sections33and34CoreJava;

public class ConstructorDemo {

	// will not return values
	// name of constructor should be the class name
	public ConstructorDemo() {
		System.out.println("I am in the constructor");
	}

	// Parameterized constructor
	public ConstructorDemo(int a, int b) {
		System.out.println("I am in the parameterized constructor");
		System.out.println(a + b);
	}

	// Parameterized constructor
	public ConstructorDemo(String a) {
		System.out.println("I am in the String parameterized constructor");
		System.out.println(a);
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// executes block of code whenever an object is created
		// compiler will call implicit constructor if you have not defined one explicitly
		// whenever you create an object the constructor is called
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cdp = new ConstructorDemo(4, 5);
		ConstructorDemo cds = new ConstructorDemo("hello");
	}

}
