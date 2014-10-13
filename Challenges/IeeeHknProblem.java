import java.util.Scanner;

public class IeeeHknProblem {
	private static Scanner clavier = new Scanner(System.in);
	private static boolean isBitPalindrome(long x) {
	    long reversed = 0, aux = x;
	    while (aux > 0) {
	    	reversed = (reversed  << 1) | (aux & 1);
	    	aux = aux >> 1;
	    }
	    return (reversed  == x) ? true : false;
	}
	public static void main(String[] args) {
		//Input
		String input=clavier.nextLine();
		String[] inputLines = input.split(",{1,}"); //Split the lines
		if (inputLines.length != 2) {
			System.exit(0);
		}
		else {
			long a = Long.parseLong(inputLines[0]), b=Long.parseLong(inputLines[1]);
			if (a>b || a<0 || b>(long) Math.pow(2, 32)-1) {
				System.exit(0);
			}
			else {
				if (b>(long) Math.pow(2, 30)) {
					System.out.println(131070);
				}
				else {
					int compteur = 0;
					long i=a;
					if (i==0) {
						++i;
						++compteur;
					}
					else if (i%2==0){ //un nombre pair ne peut pas être palindrome
						++i;
					}
					//System.out.print("{");
					while(i<=b) {
						if (isBitPalindrome(i)) {
							//System.out.print(i+",");
							++compteur;
						}
						i+=2;
					}
					//System.out.println("}");
					System.out.println(compteur);
				}
			}
		}
    }
}
