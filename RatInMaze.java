package Lecture_1_to_24;

public class RatInMaze {
	public static void display(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			
			System.out.println();
		}
		System.out.println("\n");
		
	}
	public static void printpaths(int er,int ec,int cr,int cc,int[][]arr) {
		if(er==cr&&ec==cc) {
			arr[cr][cc]=1;
			display(arr);
		}
		if(cr>er||cc>ec) {
			return;
		}
		if(arr[cr][cc]==9) {
			return;
		}
		arr[cr][cc]=1;
		printpaths(er,ec,cr,cc+1,arr);
		printpaths(er,ec,cr+1,cc,arr);
		arr[cr][cc]=0;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{0,0,9,0},{0,0,9,0},{9,0,0,0},{0,9,0,0}};
		
		printpaths(3,3,0,0,arr);

	}

}
