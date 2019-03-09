package arrayPractice;

import java.util.Arrays;

public class ArrayPractice {
	
	public static <E> void printArray(E[] array) {
		System.out.print("[");
		
		for(E element : array) {
			System.out.print(element + " ");
		}
		System.out.println("]");
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring, allocating, and Initializing
		Integer[] intArray2 = new Integer[4];
		//printArray(intArray2);
		Integer[] intArray3 = {5,2,9,1,3};
		
		String[] shoppingList = {"bananas", "apples", "pears"};
		
		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;
		
		//Custom print out array
		printArray(intArray2);
		printArray(intArray3);
		System.out.println();
		
		//Retrieve Object
		System.out.println(intArray2[3]);
		System.out.println();
		
		
		//given function
		Arrays.sort(intArray3);
		printArray(intArray3);
		System.out.println();
		
		//Print string array
		printArray(shoppingList);
		
		System.out.println("Special for loop:");
		//Special for loop: foreach
		for(String s: shoppingList) {
			System.out.println(s);
		}
	}

}
