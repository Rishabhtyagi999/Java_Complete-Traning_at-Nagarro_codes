package Lecture_1_to_24;

import java.util.Scanner;

public class Pattern_diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rows=n;
		int row=1;
		
		int nst=1;
		int nsp=n-1;
		int val=1;
		while(row<=2*rows-1) {
			int i=1;
			while(i<=nsp)
			{
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=nst) {
				System.out.print(val+"\t");
				val++;
				j++;
			}
			if(row<n) {
				nst=nst+2;
				nsp--;
			}else {
				val=val-((2*nst)-2);
				nsp++;
				nst=nst-2;
			}
			
			
			row++;
			System.out.println();
		}
		
		
	}

}
