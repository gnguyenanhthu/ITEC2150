package ch2c_hw;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter CRN number:");
		int crn = in.nextInt();
		in.nextLine();
		System.out.println("Enter course category:");
		String category = in.nextLine();
		System.out.println("Enter course name:");
		String name = in.nextLine();
		
		if (category.equals("English")) {
			System.out.println("Please enter course level (lower or upper):");
			String level = in.nextLine();
			System.out.println("Is the English course a reading course (R), a writing course (W), or both (RW)?");
			String type = in.nextLine();
			English engCourse = new English(crn,name,category,level,type);
			System.out.println(engCourse);
		}
		else if (category.equals("Math")) {
			System.out.println("Is this a STEM course (true/false)?");
			boolean stem = in.nextBoolean();
			in.nextLine();
			System.out.println("Is this course an (online), an (in-person), or a (hybrid) course?");
			String type = in.nextLine();
			Math mathCourse = new Math(crn,name,category,stem,type);
			System.out.println(mathCourse);
		}
		else if (category.equals("History")) {
			System.out.println("Is this course Area E eligible (true/false)?");
			boolean eligile = in.nextBoolean();
			in.nextLine();
			System.out.println("Is this course a (recorded), an (online), or an (in-person) course?");
			String type = in.nextLine();
			History hisCourse = new History(crn,name,category,eligile,type);
			System.out.println(hisCourse);
		}
		else
			System.out.println("Invalid course category");
			
	}
}
