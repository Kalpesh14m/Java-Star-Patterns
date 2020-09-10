package com.bunny.alphabets;

import java.util.Scanner;

public class PatternV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;
		for (i = 1; i <= n; ++i) {
			for (j = 1; j <= n; ++j) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (j = 2; j <= n; ++j) {
				if (i + j == n + 1)
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
//*               *
// *             * 
//  *           *  
//   *         *   
//    *       *    
//     *     *     
//      *   *      
//       * *       
//        *        