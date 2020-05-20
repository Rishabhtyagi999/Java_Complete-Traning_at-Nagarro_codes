package Lecture_1_to_24;

public class Chessboard {
	
	public static int ways(int er,int ec,int cr,int cc) {
		if(cr==er&&cc==ec) {
			return 1;
		}
		if(cr>er||cc>ec) {
			return 0;
		}
		int count=0;
		for(int i =cc;i<ec;i++) {
			count=count+ways(er,ec,cr,i+1);
		}
		for(int i=cr;i<er;i++) {
			count=count+ways(er,ec,i+1,cc);
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ways(2,2,0,0));

	}

}
