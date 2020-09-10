package com.bunny.patterns;

import java.util.Scanner;

public class Heart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of N ");
		int n = sc.nextInt();
		int i = 0, j = 0;

		for (i = n / 2; i <= n; i += 2) // Upper part
		{
			for (j = 1; j <= n - i; j += 2)
				System.out.print(" ");
			for (j = 1; j <= i; ++j)
				System.out.print("*");
			for (j = 1; j <= n - i; ++j)
				System.out.print(" ");
			for (j = 1; j <= i; ++j)
				System.out.print("*");
			System.out.print("\n");
		}
		for (i = n; i >= 1; --i) // Lower part
		{
			for (j = i; j <= n; ++j)
				System.out.print(" ");
			for (j = 1; j <= (i * 2) - 1; ++j)
				System.out.print("*");
			System.out.print("\n");
		}
		sc.close();
	}
}
//Enter Value of N 
//9
//   ****     ****
//  ******   ******
// ******** ********
// *****************
//  ***************
//   *************
//    ***********
//     *********
//      *******
//       *****
//        ***
//         *
