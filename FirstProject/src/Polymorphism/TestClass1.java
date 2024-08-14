package Polymorphism;

public class TestClass1 {
	
	final int a = 100;
	final static int b = 200;
	 
	public static void m1()
	{
		System.out.println("m1 - parent");
	}
	
	public void m1(int a) 
	{
		System.out.println("m1- 1 arg -int");
		
	}
	public int m1(int a, char c )
	{
		System.out.println("m1 - 2 arg- parent");
		return a;
	}
	public  int m1(char c) 
	{
		System.out.println("m1- 1 arg -char");
		return c;
	
	}
	
	public int m1(int a, char c ,int b)
	{
		System.out.println("m1 - 3 arg- parent");
		return a;
	}
	
	
	public static void m2()
	{
		System.out.println("m2- parent");
	}
	public static void main(String[] args) {
		
		
		
		 TestClass1 t1=new TestClass1();
		 t1.m1(5,'n');
		System.out.println(b);
	//	 b = 300;
		System.out.println(b);
		
	//	t1.a=1000;
		System.out.println(t1.a);
		
	}

}
