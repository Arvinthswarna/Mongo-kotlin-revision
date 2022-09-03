package exceptions;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);  //Inheriting parent class constructor.
	}
}

public class Test9 {
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Not eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}catch(InvalidAgeException ex) {
			System.out.println("Exception Handled : " + ex.getMessage());
		}

	}

}
