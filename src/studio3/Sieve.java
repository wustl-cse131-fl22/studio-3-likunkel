package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a integer number n.");
		int n = in.nextInt()+1;
		Boolean[] arrayAllNumbers = new Boolean[n];
		for (int h = 0; h < n; h ++) {
			arrayAllNumbers[h] = true;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arrayAllNumbers[i] == true) {
				for (int j = (int) Math.pow(i, 2); j <= n; j = j + i) {
					arrayAllNumbers[j] = false;
				}
			}	
		}
		int l = 0;
		for (int e = 2; e < n; e++) {
			if (arrayAllNumbers[e] == true) {
				l++;
			}
		}
		int [] newList = new int[l+1];
		int q =0;
		for (int y = 2; y < n; y++) {
			if (arrayAllNumbers[y] == true) {
				
				newList[q] = y;
				q++;
			}
		}
		for (int h = 0; h<l; h ++) {
			System.out.print(newList[h]+ ", ");
		}

	}
}
