package exceptions;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);
		try {
		System.out.println(50/0);
		}catch (Exception ex) {
			System.out.println(50/1);
		}
		//exception handled using try catch block
		System.out.println(60);
		System.out.println(70);
		System.out.println(80);
		System.out.println(90);
		System.out.println(100);

	}

}



