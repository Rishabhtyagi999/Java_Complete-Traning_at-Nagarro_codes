package Lecture_1_to_24;

public class N_stairs {
	public static int  Nstairs(int n) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		int ans=0;
		ans  += Nstairs(n-1);
		ans  += Nstairs(n-2);
		ans  += Nstairs(n-3);
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Nstairs(3));
			
		

	}

}
