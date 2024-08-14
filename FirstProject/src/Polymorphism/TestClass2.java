package Polymorphism;

public class TestClass2 extends TestClass1 {
	
     int a = 600;
	static int b = 200;
	int c= 400;
	// Override
	public int m1(int a, char c)
	{
		System.out.println("m1-2arg child");
		return a;
		
	}
	//override
	public  void m1(int a) 
	{
		System.out.println("m1- 1 arg -child");
	
	}
	//override
	public  int m1(char c) 
	{
		System.out.println("m1- 1 arg -char child");
		return c;
	}
	// overloading
	public  void m1(int a ,int b)
	{
		System.out.println("m1-  2 child");
	}
	// method hiding
	public static void m2()
	{
		System.out.println("m2- child");
	}
	
public static void main(String[] args) {
	

		TestClass2 t2=new TestClass2(); // child ref + child object
		t2.m1(5); // overriding
		t2.m1('g');//Overriding
		t2.m1(6, 7); // overloading
		t2.m2();
		
		

		TestClass1 t1=new TestClass1(); // parent ref + parent object

		t1.m1(5, 'k',8);// overloading
		t1.m2();
		t1.m1(5,'n'); // overriding
		System.out.println();
		
		TestClass1 t3= new TestClass2(); //parent ref + child object
		t3.m1('s');
		t3.m1(5, 'k',8);
		t3.m2();
		
		
		//variables variable
		
		System.out.println(t2. a); // child 
		System.out.println(t1. a); // parent
		System.out.println(t3. a); // parent ref
		
		
		TestClass1 t4 = new TestClass2();
		t4.m2();  //method hiding
		
		
		
	}

	

	

}
