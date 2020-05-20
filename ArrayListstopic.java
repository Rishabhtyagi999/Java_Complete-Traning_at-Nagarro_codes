package Lecture_1_to_24;

import java.util.ArrayList;

public class ArrayListstopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<>();
list.add(10);
list.add(20);
list.add(10);
list.add(20);
list.add(30);
System.out.println(list.size());
System.out.println(list);
System.out.println(list.get(2));
list.set(2, 30);
list.remove(2);
System.out.println(list);
	}

}
