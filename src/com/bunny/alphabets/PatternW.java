package com.bunny.alphabets;

import java.util.Scanner;

public class PatternW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 2; j <= n / 2; ++j) {
				if (i + j == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = (n / 2) + 2; j <= n; ++j) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 2; j <= n; ++j) {
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
//*                      *
// *                    * 
//  *                  *  
//   *                *   
//    *              *    
//     *     **     *     
//      *   *  *   *      
//       * *    * *       
//        *      *  