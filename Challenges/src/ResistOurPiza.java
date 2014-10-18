import java.util.HashMap;
import java.util.Scanner;

public class ResistOurPiza {
	
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> toppings = new HashMap<String, Integer>();
		toppings.put("Anchovies", 50);
		toppings.put("Artichoke", 60);
		toppings.put("Bacon", 92);
		toppings.put("Broccoli", 24);
		toppings.put("Cheese", 80);
		toppings.put("Chicken", 30);
		toppings.put("Feta", 99);
		toppings.put("Garlic", 8);
		toppings.put("Ham", 46);
		toppings.put("Jalapeno", 5);
		toppings.put("Meatballs", 120);
		toppings.put("Mushrooms", 11);
		toppings.put("Olives", 25);
		toppings.put("Onions", 11);
		toppings.put("Pepperoni", 80);
		toppings.put("Peppers", 6);
		toppings.put("Pineapple", 21);
		toppings.put("Ricotta", 108);
		toppings.put("Sausage", 115);
		toppings.put("Spinach", 18);
		toppings.put("Tomatoes", 14);
		//System.out.println(toppings.size());
		String input = keyboard.nextLine();
		if (input.isEmpty()) System.exit(0);
		String pizzaCombination = "";
		while (Character.isDigit(input.charAt(0))) {
			pizzaCombination += input.charAt(0);
			input = input.substring(1);
		}
		int amountPizzaCombination = 0;
		try {
			amountPizzaCombination = Integer.parseInt(pizzaCombination);
		}
		catch (Exception e) {
			System.exit(0);
		}
		if (amountPizzaCombination < 1 || amountPizzaCombination > 100) {
			System.exit(0);
		}
		else {
			input = input.substring(1);
			String[] inputLines = input.split(" {1,}");
			//for (String line : inputLines) System.out.println(line);
			if (inputLines.length / 2 != amountPizzaCombination || inputLines.length % 2 != 0) System.exit(0);
			else {
				//Amount of slices
				int[] amountSlice = new int[inputLines.length/2];
				for (int i = 0; i < inputLines.length; i+=2) {
					int amount = 0;
					try {
						amount = Integer.parseInt(inputLines[i]);
					}
					catch (Exception e) {
						System.exit(0);
					}
					if (amount<0 || amount >= 100) System.exit(0);
					else {
						amountSlice[i/2] = amount;
					}
				}
				//Topping style
				int[] amountCalTopping = new int[inputLines.length/2];
				for (int i = 1; i < inputLines.length; i+=2) {
					String[] toppingList = inputLines[i].split(",{1,}");
					int amount = 0;
					for (String line : toppingList) {
						//System.out.println(line);
						if(toppings.containsKey(line)) {
							amount += toppings.get(line);
						}
						else System.exit(0);
					}
					amountCalTopping[i/2] = amount;
					//System.out.println(amount);
				}
				
				//Sum
				final int CAL_PIZZA = 270;
				int calorie = 0;
				for (int i = 0; i < amountPizzaCombination; ++i) {
					calorie += amountSlice[i]*(amountCalTopping[i]+CAL_PIZZA); 
				}
				System.out.println("The total calorie intake is "+ calorie);
			}
		}
	}
}
