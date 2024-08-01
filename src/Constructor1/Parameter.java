package Constructor1;

public class Parameter {
	
	String name;
	int age;
	
	Parameter(String a, int b)
	{
		this.name=a;
		this.age=b;
		System.out.println("parameterized Constuctor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Parameter P= new Parameter("ranjeet", 28);
		System.out.println(P.name+ " "+ P.age);
	}

}
