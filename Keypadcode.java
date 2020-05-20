package Lecture_1_to_24;

public class Keypadcode {
	public static void keypad(String str,String res) {
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		String code=getcode(cc);
		for(int i=0;i<code.length();i++) {
			char key=code.charAt(i);
			keypad(ros,res+key);
		}
		
		
		
	}
	public static String getcode(char ch) {
		if(ch=='1') {
			return "abc";
		}
		if(ch=='2') {
			return "def";
		}
		if(ch=='3') {
			return "ghi";
		}
		if(ch=='4') {
			return "jkl";
		}
		if(ch=='5') {
			return "mno";
		}
		if(ch=='6') {
			return "pqr";
		}if(ch=='7') {
			return "stu";
		}
		if(ch=='8') {
			return "vwx";
		}
		if(ch=='9') {
			return "yz";
		}
		return " ";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keypad("12","");
		
	}

}
