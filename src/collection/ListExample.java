package collection;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Declare a List using ArrayList implementation
        List<String> names = new ArrayList<>();

        // 1. add(E element)
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("List: " + names);

        // 2. add(int index, E element)
        names.add(1, "David");
        System.out.println("After adding at index 1: " + names);

        // 3. get(int index)
        System.out.println("Element at index 2: " + names.get(2));

        // 4. set(int index, E element)
        names.set(0, "Sanyam");
        System.out.println("After updating index 0: " + names);

        // 5. remove(int index)
        names.remove(3);
        System.out.println("After removing index 3: " + names);

        // 6. indexOf(Object o)
        System.out.println("Index of 'Bob': " + names.indexOf("Bob"));

        // 7. contains(Object o)
        System.out.println("Contains 'Charlie'? " + names.contains("Charlie"));

        // 8. size()
        System.out.println("Size of list: " + names.size());

        // 9. isEmpty()
        System.out.println("Is list empty? " + names.isEmpty());
//10 ListIterator It is special because it can iterate both forward and backward through a List.
        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) {
            System.out.println("Next: " + it.next());
        }
        while (it.hasPrevious()) {
            System.out.println("Previous: " + it.previous());
        }
        //11.Comperator is an interface in java.util Comparator.naturalOrder() is a static method in the Comparator interface.
        names.sort(Comparator.naturalOrder());  //Comparator is a functional interface (in java.util).
        //It defines how two objects should be compared.
        System.out.println(names);
        // 12. clear()
        names.clear();
        System.out.println("After clearing: " + names);
    }
}