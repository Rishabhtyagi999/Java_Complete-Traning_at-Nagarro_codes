package Lecture_1_to_24;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int [] arr =new int[n];
		while(n>0) {
			int rem=n%10;
			arr[i]=rem;
			i++;
			n=n/10;
		}
		int odd=0,even=0;
		for(int j=i-1;j>=0;j--) {
			if(j%2!=0) {
				odd=odd+arr[j];
			}
			else {
				even=even+arr[j];
				
			}
			
		}
		System.out.println(odd);
		System.out.println(even);
		
		

	}

}
