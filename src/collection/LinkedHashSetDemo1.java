package collection;

import java.util.*;
class LinkedHashSetDemo1
{
    public static void main(String[] args)
    {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add(1);
        lhs.add(2);
        System.out.println(lhs);
    }
}


