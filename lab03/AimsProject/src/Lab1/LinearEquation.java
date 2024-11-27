package Lab1;

import java.util.Scanner;


public class LinearEquation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Phuc Thanh - nhap so a:");
		double a = input.nextDouble();
		while (a == 0) {
			System.out.println("a phai khac 0 moi nhap lai so a khac");
			a = input.nextDouble();
		}
		System.out.print("Phuc Thanh - nhap so b:");
		double b = input.nextDouble();
		System.out.println("x = " + b / a);
	}
}
