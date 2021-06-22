package sections33and34CoreJava;

import java.util.ArrayList;

public class ArrayListExample {
	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List interface
	//array have fixed size where as arraylist can grow dynamically
	//you can access and insert any value in any index private int i =5;

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("rahul");
		al.add("java");
		System.out.println(al);
		al.add(0, "student");
		System.out.println(al);
		//al.remove(1);
		//al.remove("java");
		al.add("java");
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("java"));
		System.out.println(al.indexOf("rahul"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
