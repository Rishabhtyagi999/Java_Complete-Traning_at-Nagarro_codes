package Lecture_1_to_24;

public class SpiralPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{11,12,13,14,15},{22,23,24,25,26},{33,34,35,36,37},{44,45,46,47,48}};
int left=0,top=0,right=arr[0].length-1,bottom=arr.length-1;
int dir=1;
int count=(bottom+1)*(right+1);
while(left<=right && top<=bottom) {
	if(count>0) {
		if(dir==1) {
			for(int i=left;i<=right;i++) {
				System.out.print(arr[top][i]+" ");
				count--;
			}
			dir=2;
			top++;
		}
		
	}
	if(count>0) {
		if(dir==2) {
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right]+" ");
				count--;
			}
			right--;
			dir=3;
			
		}
		
	}
	if(count>0) {
		if(dir==3) {
			for(int i=right;i>=left;i--) {
				System.out.print(arr[bottom][i]+" ");
				count--;
				
			}
			dir=4;
			bottom--;
		}
	}
	if(count>0) {
		if(dir==4) {
			for(int i=bottom;i>=top;i--) {
				System.out.print(arr[i][left]+" ");
				count--;
			}
			dir=1;
			left++;
		}
	}
}

	}

}
