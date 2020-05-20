package Lecture_1_to_4;

import java.util.Scanner;

public class CountSetbits {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int n=5;
		int mask=1;
		int count=0;
		while(n!=0) {
			if((n & mask)!= 0) {
				count++;
				
			}
			n=n>>1;
			
		}
		System.out.println(count);
		

	}

}
