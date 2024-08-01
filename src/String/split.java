package String;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="abc123@gmail.com";
      String a[]=s1.split("@");
      System.out.println(a[0]);//abc123
      System.out.println(a[1]);//gmail.com
	}

}
