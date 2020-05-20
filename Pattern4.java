package Lecture1;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int row=1;
		while(row<=no) {
			int col=1;
			while(col<=row) {
				if(col==row || col==1) {
					System.out.print("1");
				}
				else if(row%2==0)
				{
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
				col=col+1;
			}
			row=row+1;	
			System.out.println();
		}

	}

}
