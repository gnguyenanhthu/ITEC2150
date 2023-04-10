package ClassAssignment_4;

public class Demo {

    public static void main(String[] args) {
        Student alice = new Student("Alice", "ITEC");
        System.out.println(alice);
        System.out.println(alice.name);

        Faculty bob = new Faculty("Bob","Math",90000);
        System.out.println(bob);
    }
}
