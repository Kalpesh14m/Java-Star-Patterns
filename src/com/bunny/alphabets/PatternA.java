package com.bunny.alphabets;

import java.util.Scanner;

public class PatternA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;

		for (i = n; i >= 1; --i) {
			for (j = 1; j < i; ++j)
				System.out.print(" ");
			for (j = 0; j <= n - i; ++j) {
				if (j == 0 || j == n - i || i == (n + 1) / 2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		sc.close();
	}
}

//Enter Value of N 
//9
//        * 
//       * * 
//      *   * 
//     *     * 
//    * * * * * 
//   *         * 
//  *           * 
// *             * 
//*               * 
