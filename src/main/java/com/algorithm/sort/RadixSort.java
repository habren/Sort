package com.algorithm.sort;

public class RadixSort {

	/**
	 * Radix Sort
	 */
	public static void main(String[] args) {

	}
	
	public static void radixSort(int[] array, int radix){
		int max = 0;
		for(int data : array){
			if(data>max){
				max = data;
			}
		}
		int length = 0;
		int rad = 1;
		while(max%rad != 0){
			length++;
			rad *= 10;
		}
		for(int i = 0; i<length; i++){
			
		}
	}
}
