package DataStructure_Algorithms;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueImplementation qu=new QueueImplementation(10);
		for(int i=1;i<=10;i++) {
			qu.enqueue(i*3);
		}
		qu.display();
		
		

	}

}
