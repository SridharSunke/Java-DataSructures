
package com.samples.queue;

public class ArrayListImpl {
   int size=16;
   int[] arr ;
   int currentSize=0;
   double loadFactor=1.7;
	
	ArrayListImpl(int size){
		this.size=size;
		arr= new int[size];
	}
	
	
	public void add(int a) {
		if(currentSize==size+1) {
			refactorArraySize();
		}
		arr[currentSize++]=a;
	}

	
	public int get(int index) {
		if(index>size) {
			new ArrayIndexOutOfBoundsException();	
			}
		return arr[index];
	}
	
	
	public int set(int index,int value) {
		if(index>size) {
			new ArrayIndexOutOfBoundsException();	
			}
		return arr[index]=value;
	}

	public void delete(int index) {
		if(index>size) {
			new ArrayIndexOutOfBoundsException();	
			}
		rearrangerray(index);
		currentSize--;
	}
	
	private void rearrangerray(int index) {
		// TODO Auto-generated method stub
		int[] arr2= new int[size];
		System.arraycopy(arr, 0, arr2, 0, index-1 );
		System.arraycopy(arr, 0, arr2, index+1, arr.length-1 );
		arr=arr2;
	}


	private void refactorArraySize() {
		size=(int) (size*loadFactor);
		int[] arr2= new int[size];
		System.arraycopy(arr, 0, arr2, 0, arr.length-1 );
		arr=arr2;
	}
}
