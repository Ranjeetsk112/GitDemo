package String;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1= "Welcome";
    String s2 = "To java";
    String s3= " For Automation";
    System.out.println(s1+s2+s3);// Using + operator also we can add the strings.
    System.out.println(s1.concat(s2).concat(s3));// Using Concat() method also we can add multiple strings.
    System.out.println(s1.concat(s2+s3)); // WelcomeTo java For Automation
    System.out.println("Welcome".concat("To java"));// Direct add the string without variable.
    
	}

}
