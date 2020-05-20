package DataStructure_Algorithms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;

import java.util.*;

public class Graph {
	class vertex{
		String  name;
		HashMap<vertex,Integer> nbrs;
		vertex(String name){
			this.name=name;
			this.nbrs=new HashMap<>();
		}
		public void display() {
			String str=this.name+" => ";
			Set<vertex> nbrs=this.nbrs.keySet();
			for(vertex nbr:nbrs) {
				str=str+nbr.name +"("+this.nbrs.get(nbr)+")";
			}
			str=str+" END ";
			System.out.println(str);
		}
		
	}
	HashMap<String, vertex>vctes;
	Graph(){
		this.vctes=new HashMap<>();
		
	}
	public int numvtces() {
		return this.vctes.size();
	}
	public void addVertex(String name) {
		if(this.vctes.containsKey(name)) {
			return;
		}
		vertex vtx=new vertex(name);
		this.vctes.put(name,vtx);
	}
	public void removevertex(String name) {
		if(!this.vctes.containsKey(name))
		return;
		
	
	vertex vtx=this.vctes.get(name);
	Set<vertex> nbrs=vtx.nbrs.keySet();
	for(vertex nbr:nbrs) {
		nbr.nbrs.remove(vtx);
	}this.vctes.remove(name);
	
	}
	public int numEdges() {
		Collection<vertex> vtces=this.vctes.values();
		int sum=0;
		for(vertex vt:vtces) {
			sum=sum+vt.nbrs.size();
		}
		sum=sum/2;
		return sum;
	}
	public void addEdge(String name1,String name2,int cost) {
		vertex vt1=this.vctes.get(name1);
		vertex vt2=this.vctes.get(name2);
		if(vt1==null || vt2==null||vt1.nbrs.containsKey(vt2)) {
			return;
			
		}
		vt1.nbrs.put(vt2,cost);
		vt2.nbrs.put(vt1,cost);
		
		
	}
	public void removeEdge(String name1,String name2) {
		vertex vt1=this.vctes.get(name1);
		vertex vt2=this.vctes.get(name2);
		if(vt1==null || vt2==null||vt1.nbrs.containsKey(vt2)) {
			return;
			
		}
		vt1.nbrs.remove(vt2);
		vt2.nbrs.remove(vt1);
	}
	public void display() {
		Collection<vertex> vtces=this.vctes.values();
		for(vertex vt:vtces) {
			vt.display();
		}
		System.out.println("*******************************");
		
	}
	public boolean hasPath(String name1,String name2) {
		vertex vt1=this.vctes.get(name1);
		vertex vt2=this.vctes.get(name2);
		if(vt1==null || vt2==null){
			return false;
			
		}
		HashMap<vertex,Boolean>visted=new HashMap<>();
		return this.haspathbfs(vt1, vt2,visted);
		
	}
	public boolean hasPath(vertex vtx1,vertex vtx2,HashMap<vertex,Boolean> visted) {
		if(visted.containsKey(vtx1)) {
			return false;
			
		}else {
			visted.put(vtx1,true);
		}
		if(vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}
		Set<vertex>nbrs=vtx1.nbrs.keySet();
		for(vertex nbr:nbrs) {
			if(this.hasPath(nbr, vtx2,visted));
			{
				return true;
			}
		}
		return false;
	}
	private boolean haspathbfs(vertex vtx1,vertex vtx2,HashMap<vertex,Boolean> visited) {
		Queue <vertex> q=new LinkedList<>();
		q.add(vtx1);
		while(!q.isEmpty()) {
			vertex rv=q.remove();
			if(!visited.containsKey(rv)) {
				visited.put(rv, true);
				if(rv.nbrs.containsKey(vtx2)) {
					return true;
				}
				Set<vertex> nbrs=rv.nbrs.keySet();
				for(vertex nbr:nbrs) {
					if(!visited.containsKey(nbr)) {
						q.add(nbr);
					}
				}
				
			}
		}
		return false;
	} 
	public void bft() {
		Queue <vertex>q=new LinkedList<>();
		HashMap<vertex,Boolean> visited=new HashMap();
		Collection<vertex>vtces=this.vctes.values();
		for(vertex vtx:vtces) {
			if(!visited.containsKey(vtx)) {
				q.add(vtx);
				}
			while(!q.isEmpty()) {
				vertex rv=q.remove();
				if(!visited.containsKey(rv)) {
					visited.put(rv, true);
					System.out.print(rv.name+" ");
					Set<vertex> nbrs=rv.nbrs.keySet();
					for(vertex nbr:nbrs) {
						if(!visited.containsKey(nbr)) {
							q.add(nbr);
						}
					}
					
				}
			}
		}
	}
	
	public void dft() {
		Stack <vertex>stack=new Stack<>();
		HashMap<vertex,Boolean> visited=new HashMap();
		Collection<vertex>vtces=this.vctes.values();
		for(vertex vtx:vtces) {
			if(!visited.containsKey(vtx)) {
				stack.push(vtx);
				}
			while(!stack.isEmpty()) {
				vertex rv=stack.pop();
				if(!visited.containsKey(rv)) {
					visited.put(rv, true);
					System.out.print(rv.name+" ");
					Set<vertex> nbrs=rv.nbrs.keySet();
					for(vertex nbr:nbrs) {
						if(!visited.containsKey(nbr)) {
							stack.push(nbr);
						}
					}
					
				}
			}
		}
	}
	public void djikstra(String source1) {
		int [] dis=new int[this.vctes.size()];
		Queue<String> q=new LinkedList<>();
		for(int i=0;i<dis.length;i++) {
			dis[i]=Integer.MAX_VALUE;
			
		}
		dis[source1.charAt(0)-65]=0;
		q.add(source1);
		while(!q.isEmpty()) {
			String str=q.remove();
			vertex vtx=this.vctes.get(str);
			Set<vertex> nbrs=vtx.nbrs.keySet();
			for(vertex nbr:nbrs) {
				int oldcost=dis[nbr.name.charAt(0)-65];
				int newcost=dis[vtx.name.charAt(0)-65]+vtx.nbrs.get(nbr);
				if(newcost<oldcost) {
					dis[nbr.name.charAt(0)-65]=newcost;
					q.add(nbr.name);
				}
			}
		}
		for(int i=0;i<dis.length;i++) {
			System.out.print(dis[i]+" ");
		}
	}
	
	
}
