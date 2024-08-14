package abstract_discussion;

public abstract class Class_A {
	
	int a = 100;
	static int b = 200;
	
	public Class_A()
	{
		System.out.println("Class_A constructor is running : ");
	}
	
	public abstract void m1();  // abstract method / incomplete method
    
	
	
	public void m2()   // concrete/complete method
	{
		System.out.println("m2");
	}

	
	public abstract void m3(); 
	
	// public static abstract void m4();  cannot allowed
	
	public  static void m4()   // concrete/complete method
	{
		System.out.println("m4");
	}
	
	public static void main(String[] args) {
		
		m4();
		
		Class_A b1 = new Class_C();
		
		System.out.println(b1.a);
		System.out.println(b);
	}
	
	
}
