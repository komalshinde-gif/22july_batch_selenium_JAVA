package pack1;

public class VariableDiscussion {
	
	static int a = 10;  // declaration+ initialization
	static int b;
	
	int c = 100; // non static variable
	int d;    
	

	
	public static void m1() { // static method
		
		System.out.println(a);  // static variable-by 
	    
		VariableDiscussion var1 = new VariableDiscussion(); // non static variable
		System.out.println(var1.c);
		
	}
	
	
	public void m2() {    //non static method
		 System.out.println(a); // static variable
		System.out.println(c); // non static variable
		
		}
	
	
	public static void main(String[] args) {
			System.out.println(a);
			
			System.out.println(b);
			
		VariableDiscussion var1 = new VariableDiscussion();
		
		System.out.println(var1.c);
		System.out.println(var1.d);
		
		System.out.println("******static method call*****");
		
       m1();
       
       System.out.println("*****non static method call******");
       
       var1.m2();
		
  }

}
