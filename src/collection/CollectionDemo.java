package collection;

//Java Program to Demonstrate Array List
import java.util.*;
public class CollectionDemo {
    public static void main(String[] args) {
        // Creating a collection of Strings (using ArrayList implementation)
        Collection<String> fruits = new ArrayList<>();
        // 1. add(E e) – Adds elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding: " + fruits);
        // 2. size() – Returns number of elements
        System.out.println("Size: " + fruits.size());
        // 3. contains(Object o) – Checks if element is present
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));
        // 4. remove(Object o) – Removes an element
        fruits.remove("Apple");
        System.out.println("After removing Apple: " + fruits);
        // 5. isEmpty() – Checks if collection is empty
        System.out.println("Is empty? " + fruits.isEmpty());
        // 6. iterator() – Traverse the collection
        System.out.print("Traversing with iterator: ");
        Iterator<String> it = fruits.iterator();   //.iterator() is a method from the Collection interface (inherited
        //by all lists, sets, etc.). When you call .iterator(), the collection returns an iterator object.
        while (it.hasNext()) {    //Checks if there is another element available in the collection.
            System.out.print(it.next() + " ");  //next Returns the next element in the collection.
        }
        System.out.println();
        // 7. toArray() – Convert collection to array
        Object[] array = fruits.toArray();   //toArray() is a method from the Collection interface.
        System.out.println("Converted to array: " + Arrays.toString(array));
        //Arrays.toString(array) is a utility method from java.util.Arrays that converts the array into a nice readable string
        // 8. clear() – Remove all elements
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is empty after clear? " + fruits.isEmpty());
    }
}