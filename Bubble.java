package kz.herbertschildt.beginnerjava.bubble;

import java.util.Arrays;

public class Bubble {
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {2, 78, 876, 34, 6, 3, 65, 43, 54, 11, 54, 67, 73, 51, 23, 123, 5, 0, 3, 1};
		int size = arr.length;
		int temp;
		
		
		//Алгоритм пузырьковой сортировки массива
		for(int i = 1; i < size; i++) {
			
			for(int j = size-1; j >= i; j--) {
				
				if(arr[j-1] < arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
	
		int[] arrSort = new int[size];
		int j = 0;
		
		
		for(int i = size-1; i >= 0; i--) {
	
			arrSort[j] = arr[i];
			j++;
			
		}
	

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrSort));
	
	}

}
