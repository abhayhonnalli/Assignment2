package assignment2;

import java.util.*;
public class LargestSmallestMethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {89, 99, 30, 12, 9, 21, 36, 28, 66, 52};
	      System.out.println("Array = "+Arrays.toString(arr));
	      Arrays.sort(arr);
	      System.out.println("Sorted Array = "+Arrays.toString(arr));
	      System.out.println("Largest element = "+arr[9]);
	      System.out.println("2nd Largest element = "+arr[8]);
	      System.out.println("Smallest element = "+arr[0]);
	      System.out.println("2nd Smallest element = "+arr[1]);
	      
	}

}
