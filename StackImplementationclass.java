package Lecture_1_to_24;

public class StackImplementationclass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StackImplementation stack=new StackImplementation(5);
		for(int i=1;i<=5;i++) {
			stack.push(i*10);
			stack.display();
			System.out.println("***********************");
		}
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//			stack.display();
//			System.out.println("*************************");
//		}
	}

}
