import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static Scanner keyboard = new Scanner(System.in);
		
	public static int weigthToNextCol(int start, int finish, int actualCol, int[][] M) {
		int weigth = 0;
		if (start > finish) {
			int temp = finish;
			finish = start;
			start = temp;
		}
		for (int i = start; i <= finish; ++i) {
			weigth += M[i][actualCol];
		}
		return weigth;
	}
	
	public static ArrayList<Integer> indexOfMin(int col, int[][] M) {
		int min = M[0][col];
		ArrayList<Integer> index = new ArrayList<>();
		index.add(0);
		for (int i = 1; i < M.length; ++i) {
			if (M[i][col] == min) {
				index.add(i);
			}
			else if (M[i][col] < min) {
				index.clear();
				index.add(i);
				min = M[i][col];
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		
		//INPUT TREATMENT
		int n = keyboard.nextInt();
		keyboard.nextLine();
		if (n < 1 || n > 1000) return; //error
		int[][] city = new int[n][n];
		for (int i = 0; i < n; ++i) {
			String input = keyboard.nextLine();
			String[] inputLines = input.split(" {1,}");
			if (inputLines.length != n) return; //error
			for (int j = 0; j < n; ++j) {
				int lineValue = 0;
				try { //could be an error if >2^32 -1
					lineValue = Integer.parseInt(inputLines[j]);
				}
				catch (Exception e) {
					return;
				}
				if (lineValue < 0 || lineValue > 1000000) return; //out of bounds
				else {
					city[i][j] = lineValue;
				}
			}
		}
		//System.out.println(matrixToString(city));
		/*int n = 5;
		int[][] city = {
				 {1, 1, 9, 1, 1},
				 {3, 1, 9, 7, 1},
				 {4, 1, 9, 1, 1},
				 {5, 1, 1, 1, 5},
				 {6, 1, 9, 3, 1}
				};*/
		
		//OUTPUT TREATMENT
		long[] weigth = new long[n];
		for (int i = 0; i < n; ++i) {
			weigth[i] = city[i][0];
			int start = i;
			for (int j = 1; j < n; ++j) {
				ArrayList<Integer> finishList = indexOfMin(j, city);
				int[] weigthOfCol = new int[finishList.size()];
				for (int k = 0; k < finishList.size(); ++k) {
					weigthOfCol[k] = weigthToNextCol(start, finishList.get(k), j-1, city);
					//System.out.print(weigthOfCol[k] + " ");
				}
				int min = weigthOfCol[0];
				int index = finishList.get(0);
				for (int k = 1; k < finishList.size(); ++k) {
					if (min > weigthOfCol[k]) {
						index = finishList.get(k);
						min = weigthOfCol[k];
					}
				}
				start = index;
				//System.out.println(" : " + start);
				weigth[i] += min;
			}
		}
		long min = weigth[0];
		for (int i = 1; i < n; ++i) {
			if (min > weigth[i]) min = weigth[i];
		}	
		System.out.println(min);
	}
}