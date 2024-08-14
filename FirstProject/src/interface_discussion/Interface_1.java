package interface_discussion;

public interface Interface_1 {

	 int var1 = 100;   // public static and final
	 static int var2 = 200;

	public abstract void m1();
	
	public void m2();
	
	public void m3();
	
	int m7();
	
	public static void m8()
	{
		System.out .println("m8");
	}
	 
	public static void main(String[] args) {
		 m8();  // with same interface
		 
		 System.out .println(var1);
		 System.out .println(var2);
	}
	
	
}
