package assignment2;

import java.util.*;
public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        int a[]  = { 11, 25, 56, 66 }; 
        int b[]  = { 77, 53, 19, 32 }; 
  
        int a1,b1,c1;
        a1 = a.length;  
        b1 = b.length; 
        c1 = a1 + b1; 
        int c[]  = new int[c1]; 
  
       
        System.arraycopy(a, 0, c, 0, a1); 
        System.arraycopy(b, 0, c, a1, b1); 
  
        
        System.out.println(Arrays.toString(c)); 
	}

}
