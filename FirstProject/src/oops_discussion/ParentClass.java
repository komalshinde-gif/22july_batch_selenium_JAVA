package oops_discussion;

public class ParentClass {

	
	public static void m1()
	{
		System.out.println("m1 of Parent class");
	}
	
	public  void m2()
	{
		System.out.println("m2 of Parent class");
	}
	
	
	
	public static void main(String[] args) {
		
		m1();
		
		ParentClass p1 = new ParentClass();
		p1.m2();
		
		
		
		
		
		
	}	
}
