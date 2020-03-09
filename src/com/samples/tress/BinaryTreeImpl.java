
package com.samples.tree;

public class BinartTreeImpl {

	Node headNode;
	class Node {
		int value;
		Node leftNode;
		Node rightNode;
		
		
	}
	
	public void add(int value) {
		addElement(headNode,value);
	}
	
	private void addElement(Node node,int value) {
		if(node==null) {
			node=new Node();
			node.value=value;
		}else {
			if(node.leftNode==null && value<node.value)
			{
				node.leftNode=new Node();
				node.leftNode.value=value;
			}
			if(node.rightNode==null && value>node.value)
			{
				node.rightNode=new Node();
				node.rightNode.value=value;
			}
			else {
				if(value<node.value) {
					addElement(node.leftNode,value);
				}
				else if(value>node.value)
				{
					addElement(node.rightNode,value);
				}

			}
		}
		
	}
	
	
	public void get(int value) {
		getElement(headNode,value);
	}

	private void getElement(Node node, int value) {
		if(node.value==value) {
			
			return;
		}
		if(node.value<value) {
			getElement(node.leftNode,value);
		}
		else if(node.value>value) {
			
			getElement(node.rightNode,value);
		}
	}
	
	public void delete(int value) {
		getElement(headNode,value);
	}

	private Node deleteElement(Node node, int value) {
		if(node.value==value) {
			//a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
			if(node.leftNode==null && node.rightNode==null)node=null;
			//a node has exactly one child – in the parent node, we replace this node with its only child.
			else if(node.leftNode==null || node.rightNode==null)
				node =node.leftNode!=null ? node.leftNode :node.rightNode;
			//a node has two children – this is the most complex case because it requires a tree reorganization
			else if(node.leftNode!=null || node.rightNode!=null) {
				//get smallestr node
				int smallestValue = findSmallestValue(node.rightNode);
				//assign it to current node
				node.value = smallestValue;
				//delete all elements in right
				node.rightNode = deleteElement(node.rightNode, smallestValue);
			}
			
		}
		if(node.value<value) {
			getElement(node.leftNode,value);
		}
		else if(node.value>value) {
			
			getElement(node.rightNode,value);
		}
		return node;
	}

	private int findSmallestValue(Node root) {
return root.leftNode == null ? root.value : findSmallestValue(root.leftNode);
	}
	
}
