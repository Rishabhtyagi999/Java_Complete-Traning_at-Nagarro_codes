package Lecture1;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int col=1;
			
			while(col<=row) {
				System.out.print(col+" ");
				col=col+1;
			}
			col=1;
			while(col<=n-row) {
				System.out.print("*"+" ");
				col=col+1;
			}
			System.out.println();
			row=row+1;
		}
	}

}
