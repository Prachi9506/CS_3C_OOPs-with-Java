package collection;

import java.util.*;
public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq.poll());  // Output: 30 (because descending)
    }
}