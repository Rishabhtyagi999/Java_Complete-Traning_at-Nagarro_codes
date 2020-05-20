package Lecture_1_to_24;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str1="abc";
		String str2="bcad";
		int arr[]=new int[27];
		for(int i=0;i<str1.length();i++) {
			char cc=str1.charAt(i);
			arr[cc-96]=arr[cc-96]+1;
			
		}
		for(int i=0;i<str2.length();i++) {
			char cch=str2.charAt(i);
			arr[cch-96]=arr[cch-96]-1;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.println("Not Permutation");
				return; 
			}
		}
		System.out.println("Permutation");
		
		

	}
	

}
