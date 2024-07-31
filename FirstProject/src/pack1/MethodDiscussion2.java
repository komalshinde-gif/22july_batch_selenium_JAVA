package pack1;

public class MethodDiscussion2 {

	
	public static void main(String[] args) {
		
		MethodDiscussion ref1 = new MethodDiscussion();
		ref1.printData();  // calling non static method
		
		MethodDiscussion.printData1();     // calling static method
		
	}
}
