package DataStructure_Algorithms;

public class Tries_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie=new Tries();
		trie.addword("art");
		trie.addword("arts");
		trie.addword("bug");
		trie.addword("boy");
		trie.addword("sea");
		trie.addword("see");
		trie.addword("seen");
		trie.display();
		System.out.println("***************");
		trie.removeword("art");
		trie.display();
		

	}

}
