package Lecture_1_to_24;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Rishabh");
		list.add("Tyagi");
		list.add("Papa");
		list.add("Mummy");
		if(list.contains("Rishabh")) {
			System.out.println("Yes Exits");
		}
		String st=sc.next();
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			if(s.equals(st)){
				System.out.println("True");
				return;
				
			}
		}
		

	}

}
