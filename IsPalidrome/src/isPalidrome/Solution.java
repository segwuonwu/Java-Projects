package isPalidrome;

public class Solution {
	static boolean isPalidrome(char[] word) {
		int i = 0;
		int j = word.length - 1;
		
		while(i < j) {
			if(word[i] != word[j]) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] word = new char[] {'b','o','b','l','e'};
		char[] word2 = new char[] {'r','a','c','e','c','a','r'};
		boolean result = isPalidrome(word2);
		
		System.out.println("The given string is a palidrome: " + result);

	}

}
