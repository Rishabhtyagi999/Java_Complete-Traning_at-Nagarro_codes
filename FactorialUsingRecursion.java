package Lecture_1_to_24;

public class FactorialUsingRecursion {
	
	public static int Fact(int no) {
		if(no==0) {
			return 1;
		}
		int fm1=Fact(no-1);
		int fm2=no*fm1;
		return fm2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=23;
		System.out.print(Fact(no));

	}

}
