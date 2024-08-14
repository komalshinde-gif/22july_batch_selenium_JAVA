package interface_discussion;

public class Class_2 extends Class_1{
	
	public void m3()
	{
		System.out.println("m3");
		
	}
	
	   
    public static void main(String[] args) 
    {
		
    	Class_2 c1 = new Class_2();
    	c1.m1();
    	c1.m2();
    	c1.m3();
    	
    	Interface_1 ref1 = new Class_2();
    	ref1.m1();
    	ref1.m2();
    	ref1.m3();
	}

}
