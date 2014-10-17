import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem_aj {
	private static Scanner clavier = new Scanner(System.in);
    public static void main(String[] args) {
    	//System.out.println("Enter an amount");
        int amountSlopes = clavier.nextInt();
        if (amountSlopes<2 || amountSlopes>2000000) {
        	//System.out.println("Error on amount");
        	System.exit(0);
        }
        else {
        	String stringSlopes = "";
        	do {
	        	stringSlopes = clavier.nextLine();
	        } while(stringSlopes.isEmpty());
        	while(stringSlopes.charAt(0)==' ') {
    			stringSlopes = stringSlopes.substring(1);
    		}
	        String[] stringSlopeslines = stringSlopes.split(" {1,}");
	        if (stringSlopeslines.length != amountSlopes) {
	        	//System.out.println("Difference between input and amount");
	        	System.exit(0);
	        }
	        else { //Amount == lines entered
	        	//Parse the slopes into ints
	        	int[] intSlopes = new int[stringSlopeslines.length];
	        	//System.out.println(intSlopes.length);
	        	for (int i=0; i<intSlopes.length; ++i) {
	        		intSlopes[i] = Integer.parseInt(stringSlopeslines[i]);
	        		if (Math.abs(intSlopes[i])>2000) {
	        			//System.out.println("Difference between input and amount");
	    	        	System.exit(0);
	        		}
	        		//System.out.print(intSlopes[i] + " ");
	        	}
	        	
	        	//Calculate the highest possible speed
	        	int maxSpeed=0, oldSpeed=0;
	        	for (int i=intSlopes.length-1; i>=0;--i) {
	        		oldSpeed+=intSlopes[i];
	        		if (oldSpeed > maxSpeed) {
	        			maxSpeed=oldSpeed;
	        		}
	        		/*if (Math.abs(maxSpeed)>2000) {
	        			System.exit(0);
	        		}*/
	        	}
	        	System.out.println(maxSpeed);
	        }
	    }
    }
}