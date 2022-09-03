package Basic;

public class Test4 {
	public static void main(String[] args) {
		int percentage = 88;
	if(percentage>=85 && percentage<100) {
		System.out.println("first class with distinction");
	}else if(percentage>=60 && percentage<85) {
		System.out.println("first class");
	}else if(percentage>=35 && percentage<60) {
		System.out.println("second class");
	}else if(percentage>=0 && percentage<35) {
		System.out.println("fail");
	}else {
		System.out.println("Enter percentage between 1 and 100");
	}
		
	}

}
