package Lecture_1_to_24;

public class Array_2d {
	public static void display(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[4][];
		arr[1]= new int[3];
		arr [2]=new int[5];
		arr [0]=new int[1];
		display(arr);
		
	}

}
