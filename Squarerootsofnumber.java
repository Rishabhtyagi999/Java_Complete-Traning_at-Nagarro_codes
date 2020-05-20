package Lecture_1_to_4;

import java.util.Scanner;

public class Squarerootsofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int increment=1;
		double ans=1;
		int p=3;
		
		while(ans*ans<=n) {
			ans=ans+increment;
		}
		ans=ans-increment;
		double inc=0.1;
		for(int i=0;i<p;i++) {
			while(ans*ans<=n) {
				ans=ans+inc;
			}
			ans=ans-inc;
			inc=inc/10;
			
		}
		System.out.println(ans);
		

	}

}
