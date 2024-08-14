package abstract_discussion;

public class Class_C extends Class_B{

	@Override
	public void m3() {
		System.out.println("m3 body");
		
	}
	
	public static void main(String[] args) {
		
		Class_C aa = new Class_C();
		aa.m1();
		aa.m2();
		aa.m3();
		
		System.out.println();
		System.out.println("***** Parent ref child object *****");
		System.out.println();
		
		Class_A b1 = new Class_C();
		b1.m1();
		b1.m2();
		b1.m3();
		
		System.out.println();
		
		Class_A.m4();
		
		System.out.println();
		
		System.out.println(b1.a);
		System.out.println(b);
	}

}
