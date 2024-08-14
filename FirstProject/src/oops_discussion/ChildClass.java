package oops_discussion;

public class ChildClass extends ParentClass {

	int num1=300;
    static int num2=500;
	
    public void m2()
    {
    	System.out.println(super.num2);
    	System.out.println(super.num1);
    }
	
	
	
	
	public static void main(String[] args) {
		
		m1();
		ChildClass p1=new ChildClass();
		p1.m2();
		
		System.out.println(num2);	
		System.out.println(p1.num1);	
		
	}
}
