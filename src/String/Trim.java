package String;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s= "   Welcome   ";
       //String l= s.trim();
        System.out.println(s); // It will take the space value as well.
        System.out.println("before triming "+s.length());
       System.out.println(s.trim());
       System.out.println("after triming "+s.trim().length());
	}

}
