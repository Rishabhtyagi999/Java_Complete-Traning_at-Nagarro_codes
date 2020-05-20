package Lecture_1_to_24;

public class LinearSearch_BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,34,45,56,77,89};
		System.out.println(Linearsearch(arr,77));
		System.out.println(binarysearch(arr,45));
		System.out.println(sum(arr));
		reverse(arr);
		
		
		

	}
	public static int Linearsearch(int []arr,int data) {
		
		for(int i=0;i<arr.length;i++) {
			if(data==arr[i]) {
				return i;
			}
		}
		return 0;
	}

	public static int binarysearch(int[]arr,int data) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int mid=(left+right)/2;
			if(arr[mid]==data) {
				return mid;
			}
			else if(arr[mid]>data) {
				right=mid-1;
				
			}
			else {
				left=mid+1;
			}
		}
		return -1;
	}
	public static int sum(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void reverse(int []arr) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			swap(left,right);
			left++;
			right--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void swap(int left,int right) {
		int temp=left;
		left=right;
		right=temp;
	}
	
}
