package com.samples.queue;

public class QueueTest {

	
	
	private int[] arr;
	
	private int top;
	
	private int bottom;

	
	private int size;
	
	
	QueueTest(int size){
		arr=new int[size];
		top=-1;
		bottom=-1;
		this.size=size;	
		
	}
	
	QueueTest(){
		arr=new int[16];
		top=-1;
		bottom=-1;
		this.size=16;	
		
	}
	
	public void push(int value) {
		 if (bottom == -1) 
	        {
			 top = 0;
			 bottom = 0;
	            arr[bottom] = value;
	        }
	        else if (bottom + 1 >= size)
	            throw new IndexOutOfBoundsException("Overflow Exception");
	        else
		 arr[++bottom]=value;
	}
	
	public int pop() {
		return arr[top--];

	}
	
	 public boolean isEmpty() 
	    {
	        return top == -1;
	    }    
	    /*  Function to check if queue is full */
	    public boolean isFull() 
	    {
	        return top==0 && bottom == size -1 ;
	    }    
	    /*  Function to get the size of the queue */
	    public int getSize()
	    {
	        return size ;
	    }    
}
