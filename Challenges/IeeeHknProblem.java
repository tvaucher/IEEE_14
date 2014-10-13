import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IeeeHknProblem {
	private static Scanner clavier = new Scanner(System.in);
    
	private static boolean isBitPalindrome(int x) {
	    int reversed = 0, aux = x;
	    while (aux > 0) {
	    	reversed = (reversed  << 1) | (aux & 1);
	    	aux = aux >> 1;
	    }
	    return (reversed  == x) ? true : false;
	}
	public static void main(String[] args) {
		//Input
		String input=clavier.nextLine(), inputCleared="";
		for (int i=0; i<input.length();++i) {
			Character c = input.charAt(i);
			//System.out.print(c + " ");
			if (Pattern.matches("[0-9,]",c.toString())) {
				inputCleared+=c.toString();
			}
		}
		//System.out.println("a:" + inputCleared);
		String[] inputLines = inputCleared.split(",{1,}"); //Split the lines
		if (inputLines.length != 2) {
			System.exit(0);
		}
		else
		{
			int a = -1, b = -1;
			try {
				a=Integer.parseInt(inputLines[0]);
				b=Integer.parseInt(inputLines[1]);
			}
			catch (Exception e) {
				System.exit(0);
			}
			if (a>b || a<0 || b>(int) Math.pow(2, 32)-1) {
				System.exit(0);
			}
			else {
				int compteur = 0;
				for (int i=a; i<=b; ++i) {
					if (isBitPalindrome(i)) {
						++compteur;
					}
				}
				System.out.println(compteur);
			}
		}
    }
}
