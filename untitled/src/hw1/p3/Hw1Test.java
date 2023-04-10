package hw1.p3;

public class Hw1Test {
        public static void main(String[] args) {

                // Four Student objects
                Student alice = new Student("Alice");
                Student bob = new Student("Bob");
                Student carol = new Student("Carol");
                Student daniel = new Student("Daniel)");

                // Print the four Student objects
                System.out.println(alice);
                System.out.println(bob);
                System.out.println(carol);
                System.out.println(daniel);

                // Three Course objects
                Course itec4320 = new Course("ITEC 4320", 3);
                Course itec4700 = new Course("ITEC 4700", 3);
                Course itec4860 = new Course("ITEC 4860", 3);

                // Print the three Course objects
                System.out.println(itec4320);
                System.out.println(itec4700);
                System.out.println(itec4860);

                //Course enrollments
                alice.addCourse(itec4320);
                alice.addCourse(itec4700);
                alice.addCourse(itec4700);//cause an error message

                bob.addCourse(itec4700);
                bob.addCourse(itec4860);

                carol.addCourse(itec4320);
                carol.addCourse(itec4700);
                carol.addCourse(itec4860);

                daniel.addCourse(itec4320);
                daniel.addCourse(itec4700);
                daniel.addCourse(itec4860);
                daniel.addCourse(itec4700);// cause an error message

                alice.dropCourse(itec4320);
                bob.dropCourse(itec4860);
                carol.dropCourse(itec4700);

                alice.addCourse(itec4860);
                bob.addCourse(itec4320);
                daniel.addCourse(itec4700);

                itec4320.add(alice); itec4320.add(bob); itec4320.add(carol); itec4320.add(bob);
                itec4700.add(alice); itec4700.add(carol); itec4700.add(daniel); itec4700.add(bob);
                itec4860.add(alice); itec4860.add(daniel);



                Instructor evelyn = new Instructor("Evelyn");
                Instructor richard = new Instructor("Richard");

                System.out.println(evelyn);
                System.out.println(richard);

                evelyn.teachCourse(itec4320);
                evelyn.teachCourse(itec4700);
                richard.teachCourse(itec4860);

                itec4320.setInstructor(evelyn);
                itec4700.setInstructor(evelyn);
                itec4860.setInstructor(richard);

                //Print the four Student objects
                System.out.println(alice);
                System.out.println(bob);
                System.out.println(carol);
                System.out.println(daniel);

                // Print the three Course objects
                System.out.println(itec4320);
                System.out.println(itec4700);
                System.out.println(itec4860);

                //Print the two Instructor
                System.out.println(evelyn);
                System.out.println(richard);
        }
}

