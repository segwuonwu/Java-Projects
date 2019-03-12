package anagram;

import java.util.Arrays;

public class Solution {
	//Function to sort the string
	static  String sort(String s) {
		char[] a = s.toCharArray();
		
		Arrays.sort(a);
		return new String(a);
	}
	
	//Function to check if both strings are anagram
	static boolean isAnagram(String s, String t) {
		//Check if the length of both strings are equal
		if(s.length() != t.length()) {
			return false;
		}
		
		//return true if both strings are anagram
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = isAnagram("came", "acme");
		System.out.println("The strings are anagram: "+ result);

	}

}
