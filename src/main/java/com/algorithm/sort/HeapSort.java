package com.algorithm.sort;

public class HeapSort {

	/**
	 * Heap Sort
	 */
	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		heapSort(data, data.length);
		for(int a : data){
			System.out.println(a);
		}
	}
	
	public static void heapSort(int[] array, int length){
		for(int i = 0; i<length; i++){
			createMaxHeap(array, length-1-i);
			swap(array, 0, length-1-i);
		}
	}
	
	public static void createMaxHeap(int[] array, int end){
		for(int i=end/2; i>=0;i--){
			int k=i;
			while(2*k+1<=end){
				if(2*k+2<=end && array[2*k+2]>array[2*k+1] && array[k]<array[2*k+2]){
					swap(array, k, 2*k+2);
					k=2*k+2;
				}else if(2*k+1<=end && array[k]<array[2*k+1]){
					swap(array, k, 2*k+1);
					k=2*k+1;
				}else{
					break;
				}
			}
			
		}
	}
	
	public static void swap(int[] array, int first, int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}
	
}
