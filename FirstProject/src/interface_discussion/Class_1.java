package interface_discussion;

public  class Class_1 implements Interface_1 {

	int var1 = 100;
	static int var2 = 200;
	public void m1() 
	{
		System.out.println("m1");
	}


	public void m2() 
	{
		System.out.println("m2");
	}


	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

//    public void m3()
//	{
//		System.out.println("m3");
//	}
//
//    
//    public static void main(String[] args) 
//    {
//		
//    	Class_1 c1 = new Class_1();
//    	c1.m1();
//    	c1.m2();
//    	c1.m3();
//    	
//    	Interface_1 ref1 = new Class_1();
//    	ref1.m1();
//    	ref1.m2();
//    	ref1.m3();
//	}
}
