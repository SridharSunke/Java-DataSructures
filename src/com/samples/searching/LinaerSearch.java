package com.samples.searching;

import java.util.Arrays;

public class LinaerSearch {
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,23,43,2,33,44,55,44,22,29,3,54};
		int n=22;
		
		linearsearch(arr,n);
		
		Arrays.stream(arr).filter(f -> f==n).forEach(System.out::println);
	}

	private static void linearsearch(int[] arr, int n) {

		for(int i=0;i< arr.length-1;i++) {
			if(arr[i]==n) {
				System.out.print("Found at positin " +i);
			}
		}
	}
	

	
	

}
