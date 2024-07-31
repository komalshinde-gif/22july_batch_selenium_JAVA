	package pack1;

    public class MethodDiscussion {
	
// syntax : Non Static method
//public void methodName()
//	{
//	    logic or method body
//	}

public void printData() 
{
	
  System.out.println("this is non static method of MethodDiscussion class");
 
  
 
   System.out.println();
}

 

//syntax: static method
// public static void methodName()
// {
// logic or method body
// }

public static void printData1() 
{
	
	System.out.println("this is  static method of MethodDiscussion class");
	
}
 
 
public void m1()  //non static method
{
	System.out.println("call static method inside non static method");
	printData1(); // call static method
	
	MethodDiscussion ref1 = new MethodDiscussion();
	ref1.printData(); // non static method call
		
}


public static void m2()  // static method
{
	System.out.println("call non static method inside  static method");

	MethodDiscussion var1 = new MethodDiscussion();
	var1.printData();  // call non static method
	printData1(); //  call static method
		
}

public static void main(String[] args) 
	{
		
		MethodDiscussion ref1 = new MethodDiscussion();
		ref1.printData();    //calling non static method
		
		
		printData1();// calling static method
		  System.out.println();
		
		ref1.m1(); // calling static method inside non static
		
		  System.out.println();
		  
		m2(); // calling non static method inside static method
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
