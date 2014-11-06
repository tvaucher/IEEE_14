import java.util.Scanner;
//Coffee Empire
public class Solution {
	public static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		String citySize = keyboard.nextLine();
		String[] citySizeCord = citySize.split(" {1,}");
		if (citySizeCord.length != 2) {
			System.exit(0);
		}
		else {
			int W=0, H=0;
			try {
				W = Integer.parseInt(citySizeCord[0]);
				H = Integer.parseInt(citySizeCord[1]);
			}
			catch (Exception e) {
				System.exit(0);
			}
			if (W<0 || H <0 || W>100 || H>100) System.exit(0);
			else {
				int[][] cityCoffee = new int[H][W];
				for (int i = 0; i<H;++i) {
					String input = keyboard.nextLine();
					String[] inputLine = input.split("\\*");
					/*for (String line : inputLine) {
						System.out.println(line);
					}*/
					for (int j = 0; j < inputLine.length; ++j) {
						switch (inputLine[j].charAt(0)) {
						case '-' : cityCoffee[i][j] = 0;
							break;
						case 'L' : cityCoffee[i][j] = 1;
							break;
						case 'M' : cityCoffee[i][j] = 2;
							break;
						case 'H' : cityCoffee[i][j] = 3;
							break;
						//case
						}
					}
				}
				/*for (int[] line : cityCoffee) {
					for (int lin : line) {
						System.out.print(lin + " ");
					}
					System.out.println();
				}*/
				double[][][] jourProfit = new double[7][H][W];
				for (int i = 0; i < 7; ++i) {
					keyboard.nextLine();
					for (int j = 0; j < H; ++j) {
						String input = keyboard.nextLine();
						String[] inputLine = input.split("\\*");
						for (int k = 0; k < inputLine.length; ++k) {
							jourProfit[i][j][k] = Double.parseDouble(inputLine[k]);
						}
					}
				}
				/*for(double[][] linne : jourProfit) {
					System.out.println("New Day");
					for (double[] line : linne) {
						for (double lin : line) {
							System.out.print(lin + " ");
						}
						System.out.println();
					}
				}*/
				
				//Add additional income
				for (int i = 0; i< 7; ++i) {
					for (int j = 0; j < H; ++j) {
						for (int k = 0; k < W; ++k) {
							if (k-1 >= 0 && cityCoffee[j][k-1]==3 && jourProfit[i][j][k-1]>=5) {
								++jourProfit[i][j][k];
							}
							if (k+1 < W && cityCoffee[j][k+1]==3 && jourProfit[i][j][k+1]>=5) {
								++jourProfit[i][j][k];
							}
							if (j-1 >= 0 && cityCoffee[j-1][k]==3 && jourProfit[i][j-1][k]>=5) {
								++jourProfit[i][j][k];
							}
							if (j+1 < H && cityCoffee[j+1][k]==3 && jourProfit[i][j+1][k]>=5) {
								++jourProfit[i][j][k];
							}
						}
					}
				}
				/*for(double[][] linne : jourProfit) {
					System.out.println("New Day");
					for (double[] line : linne) {
						for (double lin : line) {
							System.out.print(lin + " ");
						}
						System.out.println();
					}
				}*/
				int X=-1, Y=-1;
				double maxProfit=0;
				for (int i = 0; i < H; ++i) {
					for (int j = 0; j < W; ++j) {
						double profit = 0;
						//System.out.print(cityCoffee[i][j]+ " ");
						if (cityCoffee[i][j]==3) continue;
						else {
							for (int k = 0; k < 7; ++k) {
								double profitJour = jourProfit[k][i][j]/(cityCoffee[i][j]+1);
								if (profitJour >= 20) {
									profit += profitJour-20;
								}
							}
							//System.out.print("(" + profit + ")");
							if (profit>maxProfit) {
								Y = i+1;
								X = j+1;
								maxProfit=profit;
							}
						}
						//System.out.println();
					}
				}
				System.out.print(X + " " + Y);
			}
		}

	}

}
