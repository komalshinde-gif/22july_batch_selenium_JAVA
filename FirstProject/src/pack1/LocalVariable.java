package pack1;

public class LocalVariable {
	
	int a = 10;
	static int b = 20;
	
	public  void m1()   // non static
	{
		int c =700;  // local variable
		System.out.println(c);
	   
		int a =500; // local variable
	    System.out.println(a);
	    System.out.println(this.a);
	    
		System.out.println(b);
	}

		public static void m2()
	{
		int e=1000;
		System.out.println(e);
	}
		
		
		
	
	
	public static void main(String[] args) {
		
		 int d = 800;  // local variable
		
		LocalVariable v = new LocalVariable();
		//	System.out.println(v.a);
		
		//System.out.println(b);
		
		System.out.println(d);
		
		v.m1();
		m2();
		
		
		}

}
