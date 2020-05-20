package Lecture1;

import java.util.Scanner;

public class Isnofibonacci {

	public static void main(String[] args) {
		//fibonacci series is 0 1 1 2 3 5 8 13 21 34 ........
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		
		while(c<=n) {
			if(c==n) {
				System.out.println("Fibonnaci part");
				break;
				
			}
			a=b;
			b=c;
			c=a+b;
		}
		if(c>n) {
		System.out.println("Not Fibonnaci part");
		}
	}

}
