package Lecture_1_to_24;

public class Stringtoarr {
	public static void ITOS (String[]arr,int num) {
		if(num==0) {
			return;
		}
		int rem=num%10;
		num=num/10;
		ITOS(arr,num);
		System.out.print(arr[rem]+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr= {"zero","one","two","three","four","five","six","seven","eight","nine"};
		int no=123456;
		ITOS(arr,no);

	}

}
