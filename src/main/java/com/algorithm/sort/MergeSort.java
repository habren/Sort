package com.algorithm.sort;

public class MergeSort {

	/**
	 * Merge Sort
	 */
	public static void main(String[] args) {
		int[] a={1,2,3,10,11,12,5,13,6,8,9,7,14,4};
		BottomToUpMergeSort(a, 1);
		for(int d : a){
			System.out.println(d);
		}
	}
	
	public static void UpToBottomMergeSort(int[] array, int start, int end){
		if(start<end){
			int middle = (start+end)/2;
			UpToBottomMergeSort(array, start, middle);
			UpToBottomMergeSort(array, middle+1, end);
			merge(array, start, middle, end);			
		}
	}
	
	public static void BottomToUpMergeSort(int[] array, int length){
		if(length<array.length){
			for(int i=0;i<array.length;i=i+2*length){
				if(i+2*length-1<=array.length-1){
					merge(array, i, i+length-1, i+2*length-1);
				}else{
					merge(array, i, i+length-1, array.length-1);
				}
			}
			BottomToUpMergeSort(array, 2*length);
		}else{
			return;			
		}
	}

	public static void merge(int[] array, int start, int middle, int end){
		int[] a = new int[middle-start+2];
		int[] b = new int[end-middle+1];
		for(int m=0;m<a.length-1;m++){
			a[m]=array[start+m];
		}
		a[a.length-1]=Integer.MAX_VALUE;    //classic
		for(int n=0;n<b.length-1;n++){
			b[n]=array[middle+1+n];
		}
		b[b.length-1]=Integer.MAX_VALUE;    //classic
		int i=0, j=0;
		/*while(i<a.length&&j<b.length){
			if(a[i]<=b[j]){
				array[start+i+j]=a[i];
				i++;
			}else{
				array[start+i+j]=b[j];
				j++;
			}
		}
		while(i<a.length){
			array[start+i+j]=a[i];
			i++;
		}
		while(j<b.length){
			array[start+i+j]=b[j];
			j++;
		}*/
		for(int k=start;k<=end;k++){
			if(a[i]<=b[j]){
				array[k]=a[i];
				i++;
			}else{
				array[k]=b[j];
				j++;
			}
		}
		
	}
}
