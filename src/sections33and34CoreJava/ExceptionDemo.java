package sections33and34CoreJava;

public class ExceptionDemo {

	public void getData() {
		//System.out.println(a);
	}

	public static void main(String[] args) {
		int b = 7;
		int c = 0;
		try {
			int a = b / c;
			int arr [] = new int [5];
			System.out.println(a);
			System.out.println(arr[6]);
		} catch (ArithmeticException e) {
			System.out.println("I caught the Arithmetic error / exception:");
			System.out.println(e);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("I caught the IndexOutOfBounds error / exception:");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("I caught the Generic error / exception:");
			System.out.println(e);
		} finally {
			System.out.println("Delete cookies ");
		}
		ExceptionDemo ed = new ExceptionDemo();
		ed.getData();
	}

}
