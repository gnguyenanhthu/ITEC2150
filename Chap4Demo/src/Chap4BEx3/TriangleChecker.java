package Chap4BEx3;

import java.util.Scanner;

public class TriangleChecker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side 1:");
		double side1 = input.nextDouble();
		System.out.println("Enter side 2:");
		double side2 = input.nextDouble();
		System.out.println("Enter side 2:");
		double side3 = input.nextDouble();
		
		Triangle triangle;
		try {
			triangle = new Triangle(side1, side2, side3);
			System.out.println(triangle);
		} catch (IllegalTriangleSideException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
