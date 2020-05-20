package Lecture_1_to_24;

import java.util.Scanner;

public class PatternA_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		int row=1;
		int cols=no;
		while(row<=no) {
			
			int col=1;
			while(col<=cols) {
				System.out.print((char)(64+col));
				col=col+1;
			}
			col--;
			while(col!=0) {
				System.out.print((char)(64+col));
				col--;
			}
			System.out.println();
			cols--;
			row=row+1;
		}

	}

}
