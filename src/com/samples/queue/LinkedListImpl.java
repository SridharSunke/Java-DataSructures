
package com.samples.queue;

public class LinkedListImpl {
	
	Node initial;	
	Node tail;
	Node actual;
	class Node{
		int value;
		Node next;
	}
	
	LinkedListImpl(){
		
	}
	
	
	public void put(int value) {
		Node n= new Node();
		n.value=value;
		if(actual.next != null)
		{		
			actual.next=n;	
			tail=n;
		}
		else {
			initial=n;
			tail=n;
			actual=n;
			
		}
		
		
	} 

	
	public void delete(int value) {
		if(actual.value==value) {
			initial=null;
			tail=null;
			actual=null;			
		}
		while(actual.next!=null) {
			
			if(actual.next.value==value) {
				actual.next=actual.next.next;
			}
		}
	}	
		
		public void get(int value) {
			if(actual.value==value) {
				initial=null;
				tail=null;
				actual=null;			
			}
			while(actual.next!=null) {
				
				if(actual.next.value==value) {
					actual.next=actual.next.next;
				}
			}
		
	}
		
	    public void sortList() {  
	    	
	    	
	    }
}
