package com.bunny.alphabets;

import java.util.Scanner;

public class PatternY {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				if ((i + j == n + 1) || (i == j && i <= (n + 1) / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
//Enter Value of N 
//9
//*       *
// *     * 
//  *   *  
//   * *   
//    *    
//   *     
//  *      
// *       
//*        