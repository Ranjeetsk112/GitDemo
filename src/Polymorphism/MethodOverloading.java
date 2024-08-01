package Polymorphism;

public class MethodOverloading {
	// No of arguments
	
	void show(int a, int b) //2
	{
		System.out.println("first method");
		
	}
	void show(int a)//1
	{
		System.out.println("Second Method method");
	}
	
	//Sequence of argements
	
	/*void show(String a, int b) // String, int
	{
		System.out.println("first method");
	}
	void show(int a, String b) // int, String
	{
		System.out.println("Second Method method");
	}*/
	
	// Types of the argements
	
	/*void show(String a) // String
	{
		System.out.println("first method");
	}
	void show(int a) // int
	{
		System.out.println("Second Method method");
	}*/
	
	// Can we overload java main method
	/*public static void main(int a)
	{
		System.out.println(" Main method");
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading M= new MethodOverloading();
		//M.show("abc");
		//M.show(10);
		System.out.println("Java main method");
				//main(10);
		

	}

}
