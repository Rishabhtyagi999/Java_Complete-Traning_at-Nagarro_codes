package Lecture1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int col=1;
			int no=1;
			
			while(col<=2*row-1) {
				System.out.print(no+" ");
				no=no+1;
				col=col+1;
				
			}
			System.out.println();
			row=row+1;
		}

	}

}
