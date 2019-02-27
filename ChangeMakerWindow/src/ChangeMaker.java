import javax.swing.JOptionPane;

public class ChangeMaker {

	public static void main(String[] args) {
		String amountString = JOptionPane.showInputDialog(
				"Enter a whole number from 1 to 99.\n" +
				"I will output a combination of coins\n" +
				 "that equals that amount of change.");
		
		int amount, originalAmount, quarters, dimes, nickles, pennies;
		amount = Integer.parseInt(amountString);
		originalAmount = amount;
		
		quarters = amount/25;
		amount %= 25;
		dimes = amount/10;
		amount %= 10;
		nickles = amount/5;
		amount %= 5;
		pennies = amount;
		
		JOptionPane.showMessageDialog(null, originalAmount +
				" cents in coins can be given as:\n" +
				quarters + " quarters\n" +
				dimes 	 + " dimes\n" +
				nickles  + " nickles and\n" +
				pennies	 + " pennies");
		
		System.exit(0);
	}

}
