package Lecture_1_to_24;

public class PrintSS {
	public static void Printss(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return ;
		}
		char cc=str.charAt(0);
	String res=str.substring(1);
	
		Printss(res,ans);
		Printss(res,ans+cc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String ans=" ";
		Printss(str,ans);
		

	}

}
