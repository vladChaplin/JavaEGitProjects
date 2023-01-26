package kz.herbertschildt.beginnerjava.bubble;

import java.util.Arrays;

public class SortArr {
	
	
	public static void main(String[] args) {
		
		/*
		 * Пузырьковая сортировка двумерного массива
		 * */
		
		int[][] arr = new int [][] {{2, 5, 8, 9, 4, 2, 1}, {44, 5, 64, 12, 67, 34,}, {34, 6, 2, 12, 56,}};
		
		for(int i = 0; i < arr.length; i++) {
			
			int size = arr[i].length;
			int temp;
			
			for(int j = 1; j < size; j++) {
				
				for(int b = size-1; b >= j; b--) {
					
					if(arr[i][b-1] < arr[i][b]) {
						
						temp = arr[i][b-1];
						arr[i][b-1] = arr[i][b];
						arr[i][b] = temp;

					}
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		int[][] arrFromSmall = new int[arr.length][];
		
		for(int i = 0; i < arr.length; i++) {
			
			arrFromSmall[i] = new int[arr[i].length];
			int b = 0;
			
			for(int j = arr[i].length-1; j >= 0; j--) {
				
				arrFromSmall[i][b] = arr[i][j];
				b++;
			}
		}
		
		System.out.println(Arrays.deepToString(arrFromSmall));
		
		
		
		
	}

}
