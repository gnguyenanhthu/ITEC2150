package ClassAssignment_4;
import java. util.ArrayList;
public class Grizzly {
    protected String name;

    public Grizzly(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Grizzly> itecGrizzlies(ArrayList<Grizzly> grizzlies) {
        ArrayList<Grizzly> itecGrizzlies = new ArrayList<>();
        for (Grizzly grizzly : grizzlies) {
            if (grizzly instanceof Student && ((Student) grizzly).getMajor().equals("ITEC") ||
                    grizzly instanceof Faculty && ((Faculty) grizzly).getDepartment().equals("ITEC")) {
                itecGrizzlies.add(grizzly);
            }
        }
        return itecGrizzlies;
    }

//    public static int numItecGrizzlies(ArrayList<Grizzly> grizzlies) {
//        int count = 0;
//        for (Grizzly grizzly : grizzlies) {
//            if (grizzly instanceof Student && ((Student) grizzly).getMajor().equals("ITEC") ||
//                    grizzly instanceof Faculty && ((Faculty) grizzly).getDepartment().equals("ITEC")) {
//                count += 1;
//            }
//        }
//        return count;
//    }
    public static int numItecGrizzlies(ArrayList<Grizzly> grizzlies) {
        return itecGrizzlies(grizzlies).size();
    }
}

