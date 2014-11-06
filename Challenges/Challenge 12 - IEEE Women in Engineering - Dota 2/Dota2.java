import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class Dota2 {
	public static Scanner keyboard = new Scanner(System.in);

	private static BigDecimal truncateDecimal(double x,int numberofDecimals) {
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	    }
	}
	
	public static void main(String[] args) {
		String input = keyboard.nextLine();
		String inputLines[] = input.split(" ");
		int n=0, m=0;
		n = Integer.parseInt(inputLines[0]);
		m = Integer.parseInt(inputLines[1]);
		if (n < 1 || n > 50000 || m < 1 || m > n) {
            int z= 1/0;
		}
		else {
			ArrayList<String[]> caracts = new ArrayList<String[]>();
			// Last input
			for (int i = 0; i < n; ++i) {
				String inputCaracts = keyboard.nextLine();
				caracts.add(inputCaracts.split(","));
			}
			//Visual Check
			/*for (String[] linn : caracts) {
				for (String line : linn) {
					System.out.print(line+ ".");
				}
				System.out.println();
			}*/
			
			//Generation of qi
			double[] qi = new double[n];
			for (int i = 0; i < n; ++i) {
				String purifiedString = "";
				for (int j = 0; j < caracts.get(i)[2].length(); ++j) {
					char c = caracts.get(i)[2].charAt(j);
					if (Character.isDigit(c) || c == ':') {
						purifiedString += c;
					}
				}
				//System.out.println(purifiedString);
				String[] kdSplit = purifiedString.split(":");
				int kills = Integer.parseInt(kdSplit[0]);
				int deaths = Integer.parseInt(kdSplit[1]);
                double temp = (1./(i+1));
                int temp2 = (int) Math.floor(kills*100./(kills+deaths));
				qi[i] = temp2/temp;
			}
			
			/*for(double qii : qi) {
				System.out.println(qii);
			}*/
			
			//Selection of the n biggest elements :
			int[] maxIndex = new int[m]; //first value second index
			double max=0;
			int index=0; //lower bound
			for (int i = 0; i < n; ++i) {
				if (qi[i]>max) {
					max = qi[i];
					index = i;
				}
			}
			maxIndex[0] = index;
			for (int i = 1; i < m; ++i) {
				max = 0;
				for (int j = 0; j < n; ++j) {
					if (qi[j] > max && qi[j] < qi[maxIndex[i-1]]) {
						max = qi[j];
						index = j;
					}
				}
				maxIndex[i] = index;
			}
			
			/*for(int i : maxIndex) {
				System.out.println(i);
			}*/
		    
			for(int i = 0; i < m; ++i) {
				System.out.println(caracts.get(maxIndex[i])[0]);
			}
			System.out.println("\nThis set of heroes:");
			double inte=0, str=0, agi=0; 
			for(int i = 0; i < m; ++i) {
				String type = caracts.get(maxIndex[i])[1];
				switch (type) {
				case "Intelligence" : ++inte;
					break;
				case "Strength" : ++str;
					break;
				case "Agility" : ++agi;
					break;
                default : System.exit(0); 
                    break;
				}
			}
			System.out.println("Contains "+truncateDecimal((inte*100./m), 2) +" percentage of Intelligence");
			System.out.println("Contains "+truncateDecimal((str*100./m), 2) +" percentage of Strength");
			System.out.println("Contains "+truncateDecimal((agi*100./m), 2) +" percentage of Agility");
		}
	}
}