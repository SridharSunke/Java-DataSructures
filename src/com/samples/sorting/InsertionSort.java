package com.samples.sorting;

public class InsertionSort {
	
	
	//will go backword
	public void insertionSort(int[] arr) {
		
	  for(int i=0; i<=arr.length-1;i++) {
		  for(int j=i+1;j>0;j--) {
			  if(arr[i]>arr[j]) {
				  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
			  }
		  }
		  
	  }
		
		
		
	}

}

