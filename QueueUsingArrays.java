package Lecture_1_to_24;

public class QueueUsingArrays {
	private int []data;
	private int front;
	private int size;
	public QueueUsingArrays(int capacity){
		this.data=new int[capacity];
		this.front=0;
		this.size=0;
		
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size()==0;
	}
	public void enqueue(int element)throws Exception{
		if(this.size()==this.data.length) {
			throw new Exception("Queue is full");
		}
		int ai=(this.front+this.size)%this.data.length;
		this.data[ai]=element;
		this.size++;
	}
	public int dequeue()throws Exception{
		if(this.size==0) {
			throw new Exception("Queue is Empty");
			
		}
		int rv= this.data[this.front];
		this.data[this.front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	public int front()throws Exception{
		if(this.size==0) {
			throw new Exception("Queue is Empty");
			
		}
		int rv= this.data[this.front];
		
		return rv;
	}
	public void display() {
		for(int i=0;i<this.size;i++) {
			int ai=(this.front+this.size)%data.length;
			System.out.print(this.data[ai]+" => ");
		}
		System.out.println("END");
	}
	
}
