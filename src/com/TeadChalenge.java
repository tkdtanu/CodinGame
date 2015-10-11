package com;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Vertex{
	private Integer vertexId;
	private List<Vertex> AdjList;
	public Vertex(Integer vertexId) {
		this.vertexId = vertexId;
		this.AdjList=new ArrayList<Vertex>();

	}
	public void AddNodeToAdjList(Vertex node){
		System.out.println(this.getVertexId());
		System.out.println(node.getVertexId());
		this.AdjList.add(node);
		AddThisNodeToAddingNode(node);

	}
	public List<Vertex> getAdjList() {
		return AdjList;
	}
	public void AddThisNodeToAddingNode(Vertex node){
		System.out.println(this.getVertexId());
		System.out.println(node.getVertexId());
		node.AdjList.add(this);

	}
	public void DeleteNodeFromAdjList(Vertex node){
		int position=this.AdjList.indexOf(node);
		this.AdjList.remove(position);
		DeleteThisNodeFromDeletingNode(node);
	}
	public void DeleteThisNodeFromDeletingNode(Vertex node){
		node.AdjList.remove(this);
	}
	public boolean isThisALeafNode(){
		if(this.AdjList.size()==1)
			return true;
		else
			return false;
	}

	public Integer getVertexId() {
		return vertexId;
	}




}
class TeadChalenge {

	public static void main(String args[]) throws FileNotFoundException {
		File f1=new File("D:\\java program\\Javaprojects\\CodinGame\\src\\input.txt");
		Scanner in = new Scanner(f1);
		int n = in.nextInt(); // the number of adjacency relations
		Map<Integer,Vertex> Graph=new HashMap<Integer, Vertex>();
		Vertex FirstVertex=null;
		Vertex SecondVertex=null;
		for (int i = 0; i < n; i++) {
			int xi = in.nextInt(); // the ID of a person which is adjacent to yi
			System.out.print(xi);
			if(!Graph.containsKey(xi)){
				FirstVertex=new Vertex(xi);
			}else{
				FirstVertex=Graph.get(xi);
			}
			int yi = in.nextInt(); // the ID of a person which is adjacent to xi
			System.out.print(yi);
			if(!Graph.containsKey(yi)){
				SecondVertex=new Vertex(yi);
			}else{
				SecondVertex=Graph.get(yi);
			}
			FirstVertex.AddNodeToAdjList(SecondVertex);
			Graph.put(xi, FirstVertex);
			Graph.put(yi, SecondVertex);

		}
		int steps=CountSteps(Graph);

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(steps); // The minimal amount of steps required to completely propagate the advertisement
	}

	private static int CountSteps(Map<Integer, Vertex> graph) {
		int steps=0;List<Integer> keys=new ArrayList<Integer>();
		while(graph.size()>1){
			Set<Integer> s1=graph.keySet();

			System.out.println(s1.toString());
			for(Integer node:s1){
				Vertex vertex=graph.get(node);
				if(vertex.isThisALeafNode()){
					keys.add(node);
				}
			}
			for(int a:keys){
				Vertex vertex=graph.get(a);
				Object[] obj=vertex.getAdjList().toArray();
				try {
					System.out.println(((Vertex)obj[0]).getVertexId());
					vertex.DeleteNodeFromAdjList(vertex.getAdjList().get(vertex.getAdjList().indexOf((Vertex)obj[0])));
					graph.remove(a);
				} catch (Exception e) {
					graph.remove(a);
				}
			}
			System.out.println(keys);
			keys.clear();
			steps++;
		}
		return steps;

	}
}