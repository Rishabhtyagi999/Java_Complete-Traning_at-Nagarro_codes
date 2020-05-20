package Lecture_1_to_4;

import java.util.Scanner;

public class DiamondPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int row=1;
		int stars=1;
		while(row<=2*no-1) {
			int space =1;
			while(space<=no-row) {
				System.out.print(" ");
				space=space+1;
			}
			
			while(stars<=2*no-3) {
				System.out.print("*");
				stars=stars+1;
			}
			
		
		System.out.println();
		row=row+1;
		}
		

	}

}
