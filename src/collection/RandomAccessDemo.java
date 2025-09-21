package collection;

import java.util.*;
public class RandomAccessDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> linkedList = new LinkedList<>();
        checkRandomAccess(arrayList, "ArrayList");
        checkRandomAccess(vector, "Vector");
        checkRandomAccess(linkedList, "LinkedList");
    }
    public static void checkRandomAccess(List<?> list, String name) {  //<?> → this is a wildcard generic.So //you can pass List<Integer>, List<String>, List<Double>, etc.
        if (list instanceof RandomAccess) {  //instanceif is a keyword in java check at run time whether a //given object is an instance of a class or an interface
            System.out.println(name + " implements RandomAccess interface.");
        } else {
            System.out.println(name + " does NOT implement RandomAccess interface.");
        }
    }
}