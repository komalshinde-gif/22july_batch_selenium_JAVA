package pack1;

public class ConstructorDiscussion2 {
	
	int a ;
	String b;
	int c;
	
	// Default constructor
	
	public ConstructorDiscussion2()
	{
		a=0;
		b="default";
	}
	
	// parameterized constructor
	public ConstructorDiscussion2 (int a, String b)
	{
		this.a = a;
		this.b =b;
	}
    
	// Overloading Constructor
	public ConstructorDiscussion2 (int a, String b,int c)
	{
		this.a = a;
		this.b =b;
		this.c=c;
	}
	
	public void m1()
	{
		System.out.println("Number :" + a);
		System.out.println("String :" + b);
		System.out.println("Number :" + c);
	}
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Default constructor");
		System.out.println();
		ConstructorDiscussion2 obj1 = new ConstructorDiscussion2();
		obj1.m1();
		
		System.out.println();
		System.out.println("Parameterized constructor");
		System.out.println();
		
		ConstructorDiscussion2 obj2 = new ConstructorDiscussion2(100, "komal");
		obj2.m1();
		
		System.out.println();
		System.out.println("overloading constructor");
		System.out.println();
		

		ConstructorDiscussion2 obj3 = new ConstructorDiscussion2(100, "komal", 200);
		obj3.m1();
		
	}

}
