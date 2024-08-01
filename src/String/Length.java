package String;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP to find the lenght of the string using built-in function.
     /* String s="Ranjeet";
      int l=s.length();
      System.out.println(l);// 7
      System.out.println(s.length());// 7
      System.out.println("Ranjeet".length()); //7 */
      
      //WAP to find the lenght of the string without using length() function.
      
		String s="Ranjeetkumar";
		s=s.concat("\0");
		char y[]=s.toCharArray();
		int count=0;
		int i=0;
		
		while(y[i]!='\0')
		{
			++count;
			++i;
		}
		System.out.println(count);
	}

}




