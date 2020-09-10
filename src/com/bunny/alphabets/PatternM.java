package com.bunny.alphabets;

import java.util.Scanner;

public class PatternM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (j == 1 || j == n)
					System.out.print("* ");
				else if (i <= (n + 1) / 2 && i == j)
					System.out.print("* ");
				else if (i <= (n + 1) / 2 && i + j == n + 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
//Enter Value of N 
//9
//*               * 
//* *           * * 
//*   *       *   * 
//*     *   *     * 
//*       *       * 
//*               * 
//*               * 
//*               * 
//*               * 