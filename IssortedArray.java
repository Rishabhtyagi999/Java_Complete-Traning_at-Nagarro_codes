package Lecture_1_to_24;

public class IssortedArray {
	public static boolean isSorted(int []arr,int n) {
		if(n==arr.length-1) {
			return true;
		}
		if(arr[n]>=arr[n+1]) {
			return false;
		}
		else {
			boolean myans=isSorted(arr,n+1);
			return myans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr= {123,23,34,45};
 System.out.println(isSorted(arr,0));
	}

}
