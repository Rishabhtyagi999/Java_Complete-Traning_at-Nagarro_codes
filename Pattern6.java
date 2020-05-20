package Lecture_1_to_24;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		while(row<=n) {
			int col=1;
			while(col<=row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
		
	}

}
