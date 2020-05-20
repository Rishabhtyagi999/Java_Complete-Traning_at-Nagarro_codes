package Lecture_1_to_24;

public class Towerofhonoi {
	public static void towerofhonoi(int n,String src,String des,String hel) {
		 
		if(n==0) {
			return;
		}
		System.out.println("Move nth disc from "+ src + " to "+ hel );
		towerofhonoi(n-1,src,hel,des);
		System.out.println("Move nth disc from "+ src + " to "+ hel);
		towerofhonoi(n-1,hel,des,src);
		
		
	}
	public static void main(String[] args) {
		towerofhonoi(3,"A","B","C");
		

	}

}
