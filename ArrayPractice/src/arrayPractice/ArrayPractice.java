package arrayPractice;

import java.util.Arrays;

public class ArrayPractice {
	
	public static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i<array.length; i++) {
			int item = array[i];
			System.out.print(item);
			if(i < array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void printArray(String[] array) {
		System.out.print("[");
		for(int i = 0; i<array.length; i++) {
			String item = array[i];
			System.out.print(item);
			if(i < array.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declearing, allocating, and Initializing
		int[] intArray1;
		int[] intArray2 = new int[4];
		printArray(intArray2);
		int[] intArray3 = {5,2,9,1,3};
		
		String[] shoppingList = {"bananas", "apples", "pears"};
		
		intArray2[0] = 10;
		intArray2[1] = 8;
		intArray2[2] = 5;
		intArray2[3] = 10;
		
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(intArray3));
		System.out.println();
		
		//Custom print out array
		printArray(intArray2);
		printArray(intArray3);
		System.out.println();
		
		//Retrieve Object
		System.out.println(intArray2[3]);
		System.out.println();
		
		
		//given funcion
		Arrays.sort(intArray3);
		printArray(intArray3);
		System.out.println();
		
		//Print string array
		printArray(shoppingList);
		
		System.out.println("Special for loop:");
		//Special for loop: foreach
		for(String s: shoppingList) {
			System.out.println(s);
			//System.out.println("Hi");
		}
	}

}
