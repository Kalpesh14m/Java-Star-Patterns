package com.bunny.patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;
		for (i = 1; i <= n; ++i) // First half
		{
			for (j = 1; j <= n - i + 1; ++j)
				System.out.print("* ");

			for (j = 1; j <= 2 * (i - 1); ++j)
				System.out.print("  ");

			for (j = 1; j <= n - i + 1; ++j)
				System.out.print("* ");
			System.out.print("\n");
		}

		for (i = n; i >= 1; --i) // Second half '
		{
			for (j = 1; j <= n - i + 1; ++j)
				System.out.print("* ");

			for (j = 1; j <= 2 * (i - 1); ++j)
				System.out.print("  ");

			for (j = 1; j <= n - i + 1; ++j)
				System.out.print("* ");

			System.out.print("\n");
		}
		System.out.print("\n");
		sc.close();
	}
}

//Enter Value of N 
//5
//* * * * * * * * * * 
//* * * *     * * * * 
//* * *         * * * 
//* *             * * 
//*                 * 
//*                 * 
//* *             * * 
//* * *         * * * 
//* * * *     * * * * 
//* * * * * * * * * * 
