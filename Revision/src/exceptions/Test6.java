package exceptions;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name = "john";
  System.out.println(name.length());
  try {
	  System.out.println(name.charAt(6));
  }catch(StringIndexOutOfBoundsException ex) {
	  ex.printStackTrace();
  }
	}
}
