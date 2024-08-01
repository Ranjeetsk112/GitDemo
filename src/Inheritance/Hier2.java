package Inheritance;

public class Hier2 extends Hier1 {
	
	void sleep()
	{
		System.out.println("I am sleeping");
	}
	
	public static void main(String [] agrs)
	{
		Hier2 H= new Hier2();
		H.learn();
		H.sleep();
	}

}
