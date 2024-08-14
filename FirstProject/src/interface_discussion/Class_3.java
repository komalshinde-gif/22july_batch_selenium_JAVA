package interface_discussion;

public class Class_3 implements Interface_2,  Interface_1{

	
	public void m1() 
	{
		System.out.println("m1");
	}	
		public void m2() 
	{
		System.out.println("m2");
		
	}


	public void m3()
	{
		System.out.println("m3");
	}

	
	public void m4()
	{
		System.out.println("m4");
		
	}


	public void m5()
	{
		System.out.println("m5");
		
	}
	public int m7()
	{
		System.out.println("m7");
		return 7;
		
	}
	
	
	public static void main(String[] args)
	{

    	Class_3 c3 = new Class_3();
    	c3.m1();
    	c3.m2();
    	c3.m3();
    	c3.m4();
    	c3.m5();
    	c3.m7();
    	
    	Interface_1.m8();
    	System.out .println(Interface_1.var2);
    	System.out .println(Interface_1.var1);
	}
	
	

}
