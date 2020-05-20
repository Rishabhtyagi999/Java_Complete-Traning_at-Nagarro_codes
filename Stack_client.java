package DataStructure_Algorithms;

public class Stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_Implementation st=new Stack_Implementation(15);
		
		
		
for(int i=1;i<=10;i++) {
	st.push(i*2);
}
    st.display();
    
	}

}
