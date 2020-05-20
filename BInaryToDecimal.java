package Lecture_1_to_24;

import java.util.Scanner;

public class BInaryToDecimal {
	public static void binarytodecimal(int val) {
		int temp=val;
		int dec=0;
		int base=1;
		while(temp>0) {
		int rem=temp%10;
		temp=temp/10;
		dec +=rem*base;
		base=base*2;
		}
		System.out.println(dec);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		binarytodecimal(no);

	}

}
