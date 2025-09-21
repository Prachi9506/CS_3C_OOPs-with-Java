package collection;

import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListDemo1 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();
        // ---- Adding elements ----
        list.add("A");                     // Normal add (same as addLast)
        list.addLast("B");                 // Add at end
        list.addFirst("C");                // Add at beginning
        list.offer("D");                   // Queue-style add at end
        list.offerFirst("E");              // Offer at beginning
        list.offerLast("F");               // Offer at end

        System.out.println("After adding: " + list);

        // ---- Accessing elements ----
        System.out.println("First element (getFirst): " + list.getFirst());
        System.out.println("Last element (getLast): " + list.getLast());
        System.out.println("Peek first: " + list.peekFirst());
        System.out.println("Peek last: " + list.peekLast());

        // ---- Removing elements ----
        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());
        System.out.println("After removals: " + list);

        // ---- Stack operations (push/pop) ----
        list.push("X");   // same as addFirst
        list.push("Y");
        System.out.println("After push: " + list);
        System.out.println("Pop: " + list.pop()); // removes first
        System.out.println("After pop: " + list);

        // ---- Iterating in reverse ----
        System.out.print("Reverse order: ");
        Iterator<String> it = list.descendingIterator(); //descendingIterator() Returns an iterator that traverses the list in reverse order:
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
