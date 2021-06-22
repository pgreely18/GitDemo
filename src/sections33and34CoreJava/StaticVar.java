package sections33and34CoreJava;

public class StaticVar {

	String name; // Instance variables
	String address;
	static String city = "Bangalore"; // class variables
	static int i = 0;

	static {
		city = "Bangalore";
		i = 0;
	}

	StaticVar(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {
		System.out.println(address + " " + city);
	}

	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj = new StaticVar("Bob", "Marthalli");
		StaticVar obj1 = new StaticVar("Ram", "Jayangar");
		StaticVar obj2 = new StaticVar("Ram", "Jayangar");

		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		obj.address="XYZ";
	}

}
