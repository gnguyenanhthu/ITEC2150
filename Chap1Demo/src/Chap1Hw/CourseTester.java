package Chap1Hw;
import java.util.*;

public class CourseTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Course course0 = new Course();
		Course course1 = new Course("Discrete Math", "MATH", 2300, 2, 3);
		Course course2 = new Course("Web Technologies", "ITEC", 2130, 6, 4);
		System.out.println("Enter dept: ");
		String dept = in.next();
		in.nextLine();
		System.out.println("Enter code: ");
		int code = in.nextInt();
		in.nextLine();
		System.out.println("Enter name : ");
		String name = in.next();
		in.nextLine();
		System.out.println("Enter section: ");
		int section = in.nextInt();
		in.nextLine();
		System.out.println("Enter credits: ");
		int credits = in.nextInt();
		in.nextLine();
		Course course3 = new Course(name, dept, code, section, credits);

		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(course0);
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		int totalCredits = 0, lowestCode = courseList.get(0).getCodeCourse(), highestCode = lowestCode;
		for (int i = 0; i < courseList.size(); i++) {
			System.out.print(courseList.get(i));
			lowestCode = (courseList.get(i).getCodeCourse() < lowestCode)? courseList.get(i).getCodeCourse():lowestCode;
			highestCode = (courseList.get(i).getCodeCourse() > highestCode)? courseList.get(i).getCodeCourse():highestCode;
			totalCredits += courseList.get(i).getCreditHours();
		}
		System.out.println("\nTotal credits: " + totalCredits);
		System.out.println("Lowest code: " + lowestCode);
		System.out.println("Highest code: " + highestCode);
	}
}
