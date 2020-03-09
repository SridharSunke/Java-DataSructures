package com.samples.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.samples.tree.DFS.Node;

public class BFS {

    static class Node{
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
            this.visited = false;
        }
        int data;
        Node left;
        Node right;
        boolean visited;
    }

    public static void main(String[] args) {
        //The tree:
        //   1
        //  / \
        // 7   9
        // \  / \
        //  8 2 3

        Node node1 = new Node(1);
        Node node7 = new Node(7);
        Node node9 = new Node(9);
        Node node8 = new Node(8);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.left = node7;
        node1.right = node9;
        node7.right = node8;
        node9.right = node3;
        node9.left = node2;
        System.out.println("BFS: ");
        breadthFirstSearch(node1);

    }

	private static void breadthFirstSearch(Node node) {
		Queue<Node> n= new LinkedList<>();
		if(n!=null)
			n.add(node);
		
		while(!n.isEmpty()) {
			Node temp=n.poll();
			if(temp.left!=null) {
				n.add(temp);
				}
			
			if(temp.right!=null) {
				n.add(temp);
				}
			
		}		
	}
}
