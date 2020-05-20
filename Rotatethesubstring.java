package Lecture_1_to_24;

public class Rotatethesubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="abcdefghjikl";
      int k=2;
      StringBuilder sb=new StringBuilder();
      for(int i=k;i<str.length();i++) {
    	  sb.append(str.charAt(i));
      }
      for(int i=0;i<k;i++) {
    	  sb.append(str.charAt(i));
      }
      System.out.println(sb);
	}

}
