package pack1;

public class MethodCategories {
	 
	          // Method with two argument
	public void additions(int a,int b){
		
		int sum = a+b;
		
		System.out.println(" The sum of  " + a + " and " + b + " is : " + sum);
	}
     
    public int substraction(int a,int b){
		
		int sub = a-b;
		
		return sub;
	}
    
    public static int multiply (int num, int a,int b){
		
		int suboutput =  ((a-b)* num);
		
		
		return suboutput;
		
		}
    
 public double division(int a,int b){
		
		double div = (a/b);
		
		return div;
 }
     
	
	
	public static void main(String[] args) {
		
		 System.out.println();		
		 System.out.println("**********Method with two argument");
		  System.out.println();
		  
		MethodCategories arg = new MethodCategories(); //  calling Method with two argument
		arg.additions(5,10);
		arg.additions(20,25);
		
		

		 System.out.println();		
		 System.out.println("**********Method with return type*************");
		  System.out.println();
		  
	int result1 = arg.substraction(15,10); 
			System.out.println( result1);
		  
			System.out.println();
			System.out.println("***********");
			System.out.println();
	
			
     int result2 =  MethodCategories.multiply(100,10,6 );
       System.out.println(result2);
       
		  
			System.out.println();
			System.out.println("***********");
			System.out.println();
       
       double result3 = arg.division(50,10); 
		System.out.println( result3);
	}
}    
