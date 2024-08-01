package String;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // equals(), equalsIgnoreCase()
		String s1= "welcome";
		String s2= "welcome";
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals("Welcome"));// false
		System.out.println(s1.equalsIgnoreCase("Welcome"));// true
		
		
	}

}
