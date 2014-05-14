package com.algorithm.sort;

public class ShellSort {

	/**
	 * Shell Sort
	 */
	public static void main(String[] args) {
		int[] a={1,2,3,10,11,12,5,13,6,8,9,7,14,4};
		int b = a.length/2;
		if(b/2 == 0){
			b += 1;
		}
		shellSort(a, b);
		for(int d : a){
			System.out.println(d);
		}
	}
	
	public static void shellSort(int[] array, int num){
		if(array.length>1){
			for(int i=0;i<num;i++){
				for(int j=i;j+num<array.length;j+=num){
					int temp = array[j+num];
					int k=0;
					for(k=j;k>=0;k-=num){
						if(array[k]>array[k+num]){
							array[k+num] = array[k];
							array[k]=temp;							}
					}
				}
			}
			if(num == 1){
				return;
			}else{
				int a = num/2;
				if(a>2 && a/2==0){
					a += 1;
				}
				shellSort(array,a);
			}
		}		
	}
}
