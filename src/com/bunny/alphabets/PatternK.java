package com.bunny.alphabets;

import java.util.Scanner;

public class PatternK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;
		int m = (n + 1) / 2;
		for (i = 1; i <= n; ++i) {
			for (j = 1; j <= n; ++j) {
				if (j == 1 || i + j == m + 1 || i - m + 1 == j)
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
//*       *         
//*     *           
//*   *             
//* *               
//*                 
//* *               
//*   *             
//*     *           
//*       *  