package Lecture_1_to_4;
import java.util.Scanner;

public class Patternnumberstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
    		System.out.print(i+" ");
    	}
    	System.out.println();
    	int count = 1;
    	for(int i=n-1; i>=1; i--){
    		for(int j=1; j<=i; j++){
    			System.out.print(j+" ");
    		}
    		for(int j=0; j<count; j++){
    			System.out.print("*"+" ");

    		}
    		count+=2;
    		System.out.println();
    	}

	}

}
