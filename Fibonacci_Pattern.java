package Lecture_1_to_24;

import java.util.Scanner;

public class Fibonacci_Pattern {
	
	public static void fib(int f[],int n) {
		f[1]=0;
		if(n==1) {
			return;
		}
		f[2]=1;
		if(n==2) {
			return ;
		}
		for(int i=3;i<=n;i++) {
			f[i]=f[i-1]+f[i-2];
		}
		
	}
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int no=n*(n+1)/2;
	int f[]=new int[no+1];
	fib(f,no);
	int fibnu=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(f[fibnu]+"\t");
			System.out.println();
		}
	}
	
}

}
