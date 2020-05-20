package Lecture1;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		int sum=0;
		while(no!=0) {
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println(sum);
		

	}

}
