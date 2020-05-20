package Lecture_1_to_24;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		
		int val=0;
		
		while(row<=n) {
			int col=1;
			while(col<=row) {
				
					if(col==1 ||col==row) {
						System.out.print(row+" ");
					}
					else {
						System.out.print(val+" ");
					}
					col++;
				}
				
			System.out.println();
			row++;
				
			}
			
			
		}
		
	}


