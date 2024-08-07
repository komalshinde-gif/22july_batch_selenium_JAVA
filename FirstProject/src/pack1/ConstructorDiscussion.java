package pack1;

public class ConstructorDiscussion {

	 int num1;
	 int num2=100;;



	//syntax:
	// public ClassName()
	 //{
		// constructor body
	 //}
	

	public ConstructorDiscussion()
	{
		System.out.println("0 arg Constructor is running -ConstructorDiscussion "); 
		 num1=500;
		 num2=500;
	}
	

	public ConstructorDiscussion (int a)
	{
		System.out.println("1 arg Constructor is running -ConstructorDiscussion ");
	}
	
	public ConstructorDiscussion (int a,int b)
	{
	
		System.out.println("2 arg Constructor is running -ConstructorDiscussion ");
		 num1=500;
		 num2=500;
	}
	
	public ConstructorDiscussion (String b)
	{
	     this();
		System.out.println("0 arg Constructor is running -ConstructorDiscussion ");
		 
	}
	public void m1()
	{
		System.out.println(num1);
		System.out.println(num2);
		
	}
	public static void m2()  // static method
	{
		ConstructorDiscussion ref1 = new ConstructorDiscussion();
		System.out.println(ref1.num1);
	}

		
	
	public static void main(String[] args) {
		
		 ConstructorDiscussion ref1 = new ConstructorDiscussion(6);
	ref1.m1();	
	 ConstructorDiscussion ref2 = new ConstructorDiscussion(5,7);
		ref2.m1();
		ConstructorDiscussion ref3 = new ConstructorDiscussion();
		ref3.m1();	
		ConstructorDiscussion ref4 = new ConstructorDiscussion(10,20);
		ref4.m1();	
		// m2();
		
	}
	
}
