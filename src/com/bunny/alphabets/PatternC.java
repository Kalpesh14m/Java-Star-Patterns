package com.bunny.alphabets;

import java.util.Scanner;

public class PatternC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (i == 1 && j == 1 || i == n && j == 1)
					System.out.print(" ");
				else if (j == 1 || i == 1 || i == n)
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
// ********
//*        
//*        
//*        
//*        
//*        
//*        
//*        
// ********