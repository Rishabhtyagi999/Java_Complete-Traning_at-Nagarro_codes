package Lecture_1_to_24;

public class Permutationusingrecursion {
 public static void printpermutation(String str,String ans) {
	 if(str.length()==0) {
		 System.out.println(ans);
		 return;
	 }
	 for(int i=0;i<str.length();i++) {
		 char cc=str.charAt(i);
		 String res=str.substring(0,i)+str.substring(i+1);
		 printpermutation(res,ans+cc);
		 
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String ans=" ";
		printpermutation(str,ans);

	}

}
