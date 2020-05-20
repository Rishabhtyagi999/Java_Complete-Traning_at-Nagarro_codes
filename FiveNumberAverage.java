package Lecture1;

import java.util.Scanner;

public class FiveNumberAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum=0;
		for(int i=0;i<no;i++) {
			int nu=sc.nextInt();
			sum=sum+nu;
		}
		System.out.println(sum/no);

	}

}
