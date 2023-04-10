package Chap3Q2HW;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Do you have a course to enter (Y/N): ");
		String haveCourse = in.next();
		ArrayList<Course> courses = new ArrayList<>();
		
		while(haveCourse.equals("Y")) {
			System.out.println("Enter CRN number: ");
			int crn = in.nextInt();
			in.nextLine();
			System.out.println("Enter course category: ");
			String category = in.nextLine();
			System.out.println("Enter course name: ");
			String name = in.nextLine();

			if (category.equals("English")) {
				System.out.println("Please enter course level (lower or upper): ");
				String level = in.nextLine();
				System.out.println("Is the English course a reading course (R), a writing course (W), or both (RW)? ");
				String type = in.nextLine();
				courses.add(new English(crn,name,category,level,type));
			}
			
			else if (category.equals("Math")) {
				System.out.println("Is this a STEM course (true/false)? ");
				boolean stem = in.nextBoolean();
				in.nextLine();
				System.out.println("Is this course an (online), an (in-person), or a (hybrid) course? ");
				String type = in.nextLine();
				courses.add(new Math(crn,name,category,stem,type));
			}
			
			else {
				System.out.println("Is this course Area E eligible (true/false)? ");
				boolean eligile = in.nextBoolean();
				in.nextLine();
				System.out.println("Is this course a (recorded), an (online), or an (in-person) course? ");
				String type = in.nextLine();
				courses.add(new History(crn,name,category,eligile,type));
			}
			
			System.out.println("Do you have a course to enter (Y/N): ");
			haveCourse = in.nextLine();
		}
		Collections.sort(courses);
		for (Course c: courses)
			System.out.println(c);
	}
}
