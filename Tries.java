package DataStructure_Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {
	public class Node{
		char data;
		HashMap<Character,Node> children;
		boolean isTerminal;
		Node(char data,boolean isTerminal){
			this.data=data;
			this.children= new HashMap<>();
			this.isTerminal=isTerminal;
		}
	}

	Node root;
	int numwords;
	Tries(){
		this.root=new Node('\0',false);
		this.numwords=numwords;
		
	}
	public void addword(String word) {
		this.addword(this.root,word);
	}
	private void addword(Node node,String word) {
		if(word.length()==0) {
			if(node.isTerminal) {
				
			}else {
				node.isTerminal=true;
				this.numwords++;
			}
			return ;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		Node child=node.children.get(cc);
		if(child==null) {
			child=new Node(cc,false);
			node.children.put(cc,child);
		}
		this.addword(child,ros);
	}
	public void searchword(String word) {
		this.searchword(this.root,word);
	}
	private boolean searchword(Node node,String word) {
		if(word.length()==0) {
			if(node.isTerminal) {
				return true;
			}else {
				return false;
			}
			
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		Node child=node.children.get(cc);
		if(child==null) {
			return false;
		}
		return this.searchword(child,ros);
	}
	public void removeword(String word)
	{
		this.removeword(this.root,word);
	}
		private void removeword(Node node,String word) {
			if(word.length()==0) {
				if(node.isTerminal) {
					node.isTerminal=false;
					this.numwords--;
					
				}else {
					
				}
				return ;
			}
			char cc=word.charAt(0);
			String ros=word.substring(1);
			Node child=node.children.get(cc);
			if(child==null) {
				return;
			}
			this.removeword(child,ros);
			if(child.isTerminal==false && child.children.size()==0) {
				node.children.remove(child);
			}
			
	}
		
	
	public void display() {
		this.display(this.root,"");
	}
	private void display(Node node,String res) {
		if(node.isTerminal) {
			System.out.println(res);
		}
		Set<Map.Entry<Character,Node>> childs=node.children.entrySet();
		for(Map.Entry<Character, Node> child:childs) {
			this.display(child.getValue(),res+child.getKey());
		}
		}
}
