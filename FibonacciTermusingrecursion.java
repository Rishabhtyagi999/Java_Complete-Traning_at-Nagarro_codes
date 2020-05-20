package Lecture_1_to_24;

import java.util.Scanner;

public class FibonacciTermusingrecursion {
	public static int Fib(int no) {
		if(no==0||no==1) {
			return no;
		}
		int fn1=Fib(no-1);
		int fn2=Fib(no-2);
		return fn1+fn2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println(Fib(no));
		

	}

}
