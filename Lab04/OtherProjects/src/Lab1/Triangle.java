package Lab1;

import java.util.Scanner;


public class Triangle {
	public static void main(String args[]) {
		System.out.print("Phuc Thanh - Please enter the height of a triangle that you want: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (j < n - i - 1 || j >= n + i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
