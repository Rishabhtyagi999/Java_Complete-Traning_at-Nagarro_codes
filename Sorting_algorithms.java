package Lecture_1_to_24;

public class Sorting_algorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,65,12,43,22,61,11,21,32,43,23};
		Bubblesort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		selectionsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertionsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
public static void Bubblesort(int[]arr) {
	for(int i=1;i<arr.length;i++) {
		for(int j=0;j<arr.length-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
}
public static void selectionsort(int[]arr) {
	for(int i=0;i<arr.length-1;i++) {
		int min=i;
		for(int j=i+1;j<arr.length-1;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
}
public static void insertionsort(int []arr) {
	for(int i=1;i<arr.length;i++) {
		for(int j=i;j>0 && arr[j]<arr[j-1];j--) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
}
}
