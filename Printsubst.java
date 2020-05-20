package Lecture_1_to_24;

public class Printsubst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
		
		
	}

}
