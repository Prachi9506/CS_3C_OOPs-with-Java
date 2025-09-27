package collection;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet (SortedSet implementation)
        SortedSet<Integer> set = new TreeSet<>();
        // Add elements
        set.add(100);
        set.add(101);
        set.add(103);
        set.add(104);
        set.add(110);
        set.add(115);
        set.add(107);
        // Display the whole set (sorted automatically)
        System.out.println("SortedSet: " + set);
        // 1. first() - returns first element
        System.out.println("First element: " + set.first());
        // 2. last() - returns last element
        System.out.println("Last element: " + set.last());
        // 3. headSet(104) - elements less than 104
        System.out.println("headSet(104): " + set.headSet(104));
        // 4. tailSet(104) - elements greater than or equal to 104
        System.out.println("tailSet(104): " + set.tailSet(104));
        // 5. subSet(103, 110) - elements >= 103 and < 110
        System.out.println("subSet(103, 110): " + set.subSet(103, 110));
        // 6. comparator() - null if natural order is used
        System.out.println("Comparator: " + set.comparator());
    }
}