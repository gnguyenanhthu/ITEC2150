package ca5.p1.p2;
import java.util.ArrayList;
import java.util.Collections;
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");
        list.add("gold");
        list.add("purple");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
