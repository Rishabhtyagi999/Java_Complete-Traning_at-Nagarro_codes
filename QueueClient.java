package Lecture_1_to_24;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueueUsingArrays q=new QueueUsingArrays(5);
		for(int i=1;i<=5;i++) {
			q.enqueue(i*10);
			q.display();
		}
		q.dequeue();
		q.dequeue();
		q.enqueue(60);
		q.enqueue(70);
		q.display();

	}

}
