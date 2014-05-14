package com.algorithm.sort;

/**
 * Quick Sort
 *
 */
public class QuickSort 
{
    public static void main( String[] args )
    {
    	int[] data = {2,5,6,3,4,7,8,9,6,5,10,25,41,85,67,93,41,25,57,84};
    	quickSort(data, 0, 19);
    	for(int a : data){
    		System.out.println(a);
    	}
    }
    
    public static int getMiddle(int[] array, int start, int end){
    	int temp = array[start];
    	while(start < end){
    		while(start < end && temp<=array[end]){
    			end--;
    		}
    		array[start]=array[end];
    		while(start < end && array[start]<=temp){
    			start++;
    		}
    		array[end]=array[start];
    	}
    	array[start]=temp;
    	return start;
    }
    
    public static void quickSort(int[] array, int start, int end){
    	if(start<end){
        	int middle = getMiddle(array, start, end);
        	quickSort(array, start, middle-1);
        	quickSort(array, middle+1, end);    		
    	}
    }
}
