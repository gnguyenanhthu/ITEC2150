package hw1.p1;

public class CourseTest {
    public static void main(String[] args) {
        Course itec2150 = new Course("ITEC 2150", 3);
        System.out.println(itec2150);

        System.out.println(itec2150.add("Alice"));
        System.out.println(itec2150.add("Bob"));
        System.out.println(itec2150.add("Carol"));
        System.out.println(itec2150.add("Daniel"));

        System.out.println(itec2150);

        itec2150.remove("Bob");
        itec2150.add("Daniel");
        System.out.println(itec2150);
    }
}
