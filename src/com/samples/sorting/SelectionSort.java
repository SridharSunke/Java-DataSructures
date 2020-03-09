package com.samples.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	
	//will select minimum

public static void main(String[] args) {
		
		
		int[] arr= {1,23,43,2,33,44,55,44,22,29,3,54};
		int[] selectedArray=selectionSort(arr);
		Arrays.stream(selectedArray).forEach(System.out::println);
		
}

//also includes logic find minimum in a array
private static  int[] selectionSort(int[] arr) {
	int[] sortedArray= {};
	int size=arr.length-1;
	int minIndex=0;
	while(size>0) {
		for(int j=0;j< arr.length-1;j++) {
		  if(arr[j]<arr[minIndex]) {
			  minIndex=j;
		  }
		}	
		sortedArray[minIndex]=arr[minIndex];		
	}
	return sortedArray;
}
}
