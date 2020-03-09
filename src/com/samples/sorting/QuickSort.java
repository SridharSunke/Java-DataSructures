package com.samples.sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class QuickSort {
	    private static int length;
		private static int array[]= {22,43,12,56,33,44,61,1};
		
		public static void main(String[] args) {
			 sort(array);
	        Stream.of(array).forEach(System.out::print);

		}
	 
	    public static void sort(int[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        length = inputArr.length;
	        quickSort(0, length - 1);
	    }
	 
	    private static void quickSort(int lowerIndex, int higherIndex) {
	    	int i=lowerIndex;
	    	int j=higherIndex;
	    	int pivot=array[lowerIndex+(higherIndex-lowerIndex)/2];
	    	
	    	while(i<j) {
	    		
	    		
	    		/**
	             * In each iteration, we will identify a number from left side which 
	             * is greater then the pivot value, and also we will identify a number 
	             * from right side which is less then the pivot value. Once the search 
	             * is done, then we exchange both numbers.
	             */
	    		while(array[i]<pivot) {
	    			i++;
	    		}
	    		while(array[j]>pivot) {
	    			j--;
	    		}
	    		if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	    	}
	    	if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    	
	    }


	    private static void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
}
