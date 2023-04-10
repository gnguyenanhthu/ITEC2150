package ch2a_2a_association_mimirMain;

public class Main {

	public static void main(String[] args) {
		Student smith = new Student("Tina Smith");
		Student wang = new Student("Alan Wang");
		Student moore = new Student("Amy Moore");
		Student lee = new Student("Kate Lee");
		
		Teacher teacherJones = new Teacher("David Jones");
		
		Course 	itec2140 = new Course("Programming Fundamentals", teacherJones);
		teacherJones.addCourse(itec2140);
		//TODO 1: add code to register student smith and wang to itec2140		
		

		Course 	itec3100 = new Course("Intro to Networking", teacherJones);
		teacherJones.addCourse(itec3100);
		//TODO 2: add code to register student smith, moore and lee to itec2150		
		
		
		System.out.println(itec2140);
		System.out.println(itec3100);
		System.out.println(teacherJones);
		System.out.println(smith);
		System.out.println(wang);
		System.out.println(moore);
		System.out.println(lee);
	}
}
