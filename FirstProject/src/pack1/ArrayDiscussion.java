package pack1;

import access_modifier.ClassA2;

public class ArrayDiscussion 
{
 
	public static void main(String[] args) {
		
		System.out.println("GIT Test Change");
	//syntax:
		

	// dataType[]arrayName ={value1,value2,value3,...};
		
		int[]array1 = {10,20,30,40,50,60};
		
		
		System.out.println(array1[2]);
		
		int dataFromArray = array1[4];
		System.out.println(dataFromArray);
		
		int add =array1[1]+20;
		
		System.out.println(add);
		
	    int arraySize = array1.length;
	    System.out.println(arraySize);
	
	     array1[2]=100;
	
	    System.out.println(array1[2]);
	    
	    byte[]byteArray= {1,3,2,50,60,70};
	    
	    
	    // syntax:
	    //dataType[] arrayName = new dataType[arraySize];
	    int[]komalArray =new int[4];
	    
	    System.out.println(komalArray[0]);
	    
	    //update /change numbers in array
		
	    komalArray[0]=60;
	    komalArray[1]=70;
	    
	    System.out.println(komalArray[0]);
	    System.out.println(komalArray[1]);
	    System.out.println(komalArray[2]);
		
		
	    
	//   ClassA2 aa= new ClassA2();
	    
	    ClassA.m1;
		
	    
	    
	
	
	
	
		
		
		
		
	}
}
