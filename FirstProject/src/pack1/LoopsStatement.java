package pack1;

public class LoopsStatement {

	
	public static void main(String[] args) {
		
		int num=5;
		while(num>=1)
		{
			System.out.println("loop :" + num);
			num-- ;

		}
		System.out.println("after while loop");

		
		System.out.println();
		System.out.println("*********do while loop****************");
		System.out.println();

		
		
		
		int num2=1;
		
		do {
			System.out.println("loop :" +num2);
			num2 ++;
			}
		while(num2<=5);
		
		System.out.println();
		System.out.println("*********for loop****************");
		System.out.println();
		
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("loop :" + i);	
		}
		
	
		
		
		System.out.println();
		System.out.println("*********foreach loop****************");
		System.out.println();
		
		int[] element = {1,2,3,4,5,};
		
		for (int Element: element) {
			System.out.println("loop :" + Element);
	}
		
		System.out.println();
		System.out.println("*********break statement****************");
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("loop :" + i);	
			
			if(i==3)
			{
				break;
			}
			System.out.println("after if block ");
		}
		System.out.println("after for loop");

		

		System.out.println();
		System.out.println("*********continue keyword****************");
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println("loop :" + i);	
			
		}
		System.out.println("after for loop");
	
		
	}
}
