package com.bunny.alphabets;

import java.util.Scanner;

public class PatternS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;
		for (i = 1; i <= n; ++i) {
			for (j = 1; j <= n; ++j) {
				if (i == 1 && j == 1 || i == n && j == n)
					System.out.print("  ");
				else if (i == 1 || i == (n + 1) / 2 || (j == 1 && i <= (n + 1) / 2))
					System.out.print("* ");
				else if (j == n && i >= (n + 1) / 2 || i == n)
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
//  * * * * * * * * 
//*                 
//*                 
//*                 
//* * * * * * * * * 
//                * 
//                * 
//                * 
//* * * * * * * *   