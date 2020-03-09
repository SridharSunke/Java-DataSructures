package com.samples.searching;

import java.util.Arrays;

public class BinarySearch {

public static void main(String[] args) {
		
		
		int[] arr= {1,22,33,35,66,78,88,89,90,91,92,93};
		int n=35;
		
		binarySearch(arr,n);
		
	}

	private static void binarySearch(int[] arr, int n) {
		int start =1;
		int end =arr.length-1;

		findElement(arr,start,end,n);
	}
private static void findElement(int[] arr, int start, int end,int n) {
		
		if(start>end) {
			System.out.print("Element not Found ");
			return;
		}
	
		int middle=(start+end)/2;
		if(arr[middle]==n) {
			System.out.print("Element Found at Index " + middle);
		}
		else if(n<arr[middle]) {
			findElement(arr,start,middle-1,n);
		}
		else if(n>arr[middle]) {
			findElement(arr,middle+1,end,n);
		}	

		
	}
	
}
