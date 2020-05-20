package Lecture_1_to_24;

import java.util.Scanner;

public class RecursionDemo {

	public static void PD(int n) {
		if(n==0) {
			return;
		}
		
		PD(n-1);
		System.out.println(n);
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		PD(no);
	}
}
