package assignment2;

import java.util.*;

public class LargestSmallestMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
	      int arr[] = {89, 99, 30, 12, 9, 21, 36, 28, 66, 52};
	      System.out.println("Array = " +Arrays.toString(arr));
	      int count = arr.length;
	      for (int i = 0; i < count; i++) {
	         for (int j = i + 1; j < count; j++) {
	            if (arr[i] > arr[j]) {
	               a = arr[i];
	               arr[i] = arr[j];
	               arr[j] = a;
	            }
	         }
	      }
	
	      System.out.println("Largest: "+arr[count-1]);
	      System.out.println("Second Largest: "+arr[count-2]);
	      System.out.println("Smallest: "+arr[0]);
	      System.out.println("Second Smallest: "+arr[1]);
	      
	      
	}

}
