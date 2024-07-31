package pack1;

public class ControlStatement {
	int a = 10;
	int b = 20;

	public void m1() 
	{
		System.out.println("before if else block");
		
		if(a>b) 
		{
			System.out.println("value of a is greater than b");
		}
		else if((a*b)>400)
		{
			System.out.println("(a*b)>400");
		}
		
		else 
		{
			System.out.println("both condition are false");
			
			System.out.println("2nd line of code");
		}
		System.out.println("After if else block");
		
		System.out.println();
		System.out.println("***************");
		System.out.println();
		
	}
	public void m2() 
	{
		int dayNum=6;
		switch(dayNum) {
		case 0:
			System.out.println("Monday");
			break;
			
		case 1:
			System.out.println("Tuesday");
			break;
			
		case 2:
			System.out.println("Wensday");
			break;
			
		case 3:
			System.out.println("Thursday");
			break;
			
		case 4:
			System.out.println("Friday");
			break;
			
		case 5:
			System.out.println("Saturday");
			break;
			
		case 6:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("value is incorrect");
			break;
		}	
	}
	
	
	
	public static void main(String[] args) {
		
		ControlStatement cs = new ControlStatement();
		cs.m1();
		
		cs.m2();
		
		
	} 
}
