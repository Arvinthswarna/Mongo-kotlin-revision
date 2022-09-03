package exceptions;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(num/0);
			System.out.println(3);
		}catch(ArithmeticException ex) {
			ex.printStackTrace(); //it will show what type of exception it was
		}
		System.out.println(4);
	}

}
