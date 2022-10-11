package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;
import java.util.*;
public class Currency {
	static int[] reverse(int a[], int n) 
    { 
		Arrays.sort(a);
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
        return b;
     } 
	public static void main(String Args[])throws Exception{
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of curency domination\n");
		int size = s.nextInt();
		int arr[] = new int[size];
		int arr2[] = new int[size];
		System.out.println("enter the values of currency domination\n");
		for (int i = 0; i < size; i++)	
		
		arr[i] = s.nextInt();
		
	    arr2 = reverse(arr, arr.length);
	    
	    
	    
		System.out.println("enter the total amount you want to pay\n");
		int amt = s.nextInt();	
		int[] counter = new int [size];
		for (int i=0; i< size; i++) {
			
			if(amt>= arr[i])
			{
				counter[i] = amt/ arr2[i];
				amt = amt % arr2[i];
			}
			System.out.println("Currency notes");
			 
	        for ( i = 0; i < size; i++) 
	        {
	            if (counter[i] != 0) {
	                System.out.println(arr2[i] + " : "   + counter[i]);
	                 
			
		}
	        }
		}
	}
}		
		
	


