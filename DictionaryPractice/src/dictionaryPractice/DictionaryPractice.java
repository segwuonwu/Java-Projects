package dictionaryPractice;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Spanish Dictionary
		Map<String, String> englSpanDictionary = new HashMap<String, String>();
		
		// Putting things inside our dictionary
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tusday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		englSpanDictionary.put("Saturday", "Sabado");
		englSpanDictionary.put("Sunday", "Domingo");
		// Retrieve things from our dictionary
		
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		// print all keys
		System.out.println(englSpanDictionary.keySet());
		// print all values
		System.out.println(englSpanDictionary.values());
		// print all size
		System.out.println("The size of our dictionary is " + englSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		// shopping list
		Map<String, Boolean> shoppingList = new HashMap<String,Boolean>();
		// put some stuff in dictionary
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		//Retrieve items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Oreos"));
		//Key-Value Pairs print out
		System.out.println(shoppingList.toString());
		//isEmpty
		System.out.println(shoppingList.isEmpty());
		shoppingList.remove("Eggs");
		// Replace values for a certain key
		shoppingList.replace("Bread", Boolean.FALSE);
		//Key-Value Pairs print out
		System.out.println(shoppingList.toString());
		
		//Clear our dictionary
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		//isEmpty
		System.out.println(shoppingList.isEmpty());
	}

}
