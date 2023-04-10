package ca7;
import java.util.ArrayList;
public class MyGenerics {
    public static <T> ArrayList <Integer> findIndices(ArrayList<T> list, T target){
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i =0; i < list.size(); i ++) {
            T elem = list.get(i);
            if (elem.equals(target)) {
                indices.add(i);
            }
        }

        return indices;

    }
//    public static <T> int firstIndex(ArrayList<T> list, T target) {
//        ArrayList<Integer> indices = findIndices(list, target);
//        if (indices.isEmpty()) {
//            return -1;
//        }
//        else {
//            return indices.get(0);
//        }
//    }
        public static <T> int firstIndex(ArrayList<T> list, T target) {
            ArrayList<Integer> indices = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                T elem = list.get(i);
                if (elem.equals(target)) {
                    return i;
                }
            }

            return -1;

        }
    public static <T> int lastIndex(ArrayList<T> list, T target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = list.size() -1; i >=0; i--) {
            T elem = list.get(i);
            if (elem.equals(target)) {
                return i;
            }
        }

        return -1;

    }
    public static <T> boolean contains(ArrayList<T> list, T target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (T elem : list) {
            if (elem.equals(target)) {
                return true;
            }
        }

        return false;

    }
}
