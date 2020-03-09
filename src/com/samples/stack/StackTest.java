package com.samples.stack;

public class StackTest {

	
	private int[] arr;
	
	private int top;
	
	private int size;
	
	
	StackTest(int size){
		arr=new int[size];
		top=-1;
		this.size=size;	
		
	}
	
	StackTest(){
		arr=new int[16];
		top=-1;
		this.size=size;	
		
	}
	
	public void push(int value) {
		if(isFull()) {
			System.exit(1);
		}
		arr[++top]=value;
	}
	
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top==size-1;
	}

	public int pop(int value) {
		if(isEmpty()) {
			System.exit(1);
		}
		return arr[top--];
	}
	public int peek(int value) {
		if(isEmpty()) {
			System.exit(1);
		}
		return arr[top];
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
	
	
}
