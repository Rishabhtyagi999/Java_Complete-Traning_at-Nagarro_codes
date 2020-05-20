package Lecture_1_to_24;

import java.util.Scanner;

public class Decimal_to_octal {

	public static void decimaltooctal(int val) {
		int temp=val;
		int [] octalnum=new int[100];
		int i=0;
		while(temp!=0) {
		octalnum[i]=temp%8;
		temp=temp/8;
		i++;
		
		}
		for (int j = i - 1; j >= 0; j--) 
            System.out.print(octalnum[j]); 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		decimaltooctal(no);

	}

}
