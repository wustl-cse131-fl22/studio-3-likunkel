package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a integer number n.");
		int n = in.nextInt();
		int[] arrayAllNumbers = new int[n+1];
		for (int i = 0; i <= n; i++) {
			arrayAllNumbers[i] = i;
			//System.out.println(arrayAllNumbers[i]);
		}
		for (int k = 0; k < arrayAllNumbers.length; k++) {
			int[] arrayTemp = new int[arrayAllNumbers.length];
			if (arrayAllNumbers[k]%2 != 0 || arrayAllNumbers[k] == 2) {
				arrayTemp[k]=arrayAllNumbers[k];
				System.out.println(arrayTemp[k]);
			}
			
		}

	}

}
