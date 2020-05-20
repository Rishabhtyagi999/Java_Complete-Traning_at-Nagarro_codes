package Lecture_1_to_24;



public class SUmOFarrayusingrecursion {
	public static int sumn(int [] arr,int i) {
		if(arr.length==i) {
			return 0;
		}
		int resans=sumn(arr,i+1);
		int ans=arr[i]+resans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5};
		System.out.println(sumn(arr,0));
	}

}
