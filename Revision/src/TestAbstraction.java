
	
	abstract class Welcome{
		void display() {
			System.out.println("welcome to java");
		}
		abstract void info();
	}
	public class TestAbstraction extends Welcome {
		void info() {
			System.out.println("info method implementation");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAbstraction obj = new TestAbstraction();
		obj.info();
		obj.display();

	}

}
