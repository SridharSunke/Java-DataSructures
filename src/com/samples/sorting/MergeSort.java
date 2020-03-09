package com.samples.sorting;

import java.util.stream.Stream;

public class MergeSort {

	   private static int length;
			private static int array[]= {22,43,12,56,33,44,61,1};
			
			
			//split & merge recurrsively
			public static void main(String[] args) {
				 sort(array);
		        Stream.of(array).forEach(System.out::print);

			}
    public static void sort(int[] inputArr) {
        
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        length = inputArr.length;
        mergeSort(inputArr,inputArr.length);
    }
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
     
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
     
        merge(a, l, r, mid, n - mid);
    }
	private static void merge(int[] a, int[] l, int[] r, int left, int right) {
		// TODO Auto-generated method stub
		 int i = 0, j = 0, k = 0;
		    while (i < left && j < right) {
		        if (l[i] <= r[j]) {
		            a[k++] = l[i++];
		        }
		        else {
		            a[k++] = r[j++];
		        }
		    }
		    while (i < left) {
		        a[k++] = l[i++];
		    }
		    while (j < right) {
		        a[k++] = r[j++];
		    }
	}
}
