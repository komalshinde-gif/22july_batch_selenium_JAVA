package oops_discussion;

import pack1.VariableDiscussion;

public class Class2 extends Class1 {
	
	public Class2()
	{
		super(6,"r",'s');
		
		System.out.println("Class2: child class constructor running");	
		
	}
   public static void main(String[] args) {
	   
	   Class2 c2 = new Class2();
	   VariableDiscussion.m1();
	
}
}
