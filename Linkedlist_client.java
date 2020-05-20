package DataStructure_Algorithms;

public class Linkedlist_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist_Implementation list=new Linkedlist_Implementation();
		list.addFirst(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		//list.addAt(1, 90);
		
		list.display();

	}

}
