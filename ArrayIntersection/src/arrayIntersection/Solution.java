/*
 * 	Given two arrays write a function to compute their intersection
 * 	Condition: Each element returned must be unique
 */
package arrayIntersection;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
	
	static int[] arrayIntersection(int[] arr1, int[] arr2) {
		//Create a HashSet to hold the intersecting values
		HashSet<Integer> intersection = new HashSet<Integer>();
		
		//Sort both arrays;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		//Declare two integers to represent the index of the two arrays
		int i = 0;
		int j = 0;
		while(i < arr1.length && j < arr2.length) {
			//check to see if they intersect and store the value in the HashSet
			if(arr1[i] < arr2[j]) {
				i++;
			}else if(arr1[i] > arr2[j]) {
				j++;
			}else {
				intersection.add(arr1[i]);
				i++;
				j++;
			}
		}
		//Create an array to hold the elements in the HashSet
		int[] result = new int[intersection.size()];
		int index = 0;
		
		for(Integer resultIndex : intersection) {
			result[index] = resultIndex;
			index++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {1, 2, 2, 7, 5};
		int[] b = new int[] {2, 5, 2, 8, 10};
		
		System.out.println("The two arrays are: "+ Arrays.toString(a)+ " and "+ Arrays.toString(b));
		int[] result = arrayIntersection(a,b);
		System.out.println("Their intersection is: " + Arrays.toString(result));
	}

}
