package package3;

import package1.Parent;

public class Other {
    public static void main(String[] args) {
        Parent obj = new Parent();

        //System.out.println(obj.a); // private - not accessible
        // System.out.println(obj.b); // default - not accessible (different package)
        //System.out.println(obj.c); // protected - not accessible (not a subclass)
        System.out.println(obj.d);   // public - accessible everywhere
       // System.out.println(obj.d);   // public - accessible everywhere
        //System.out.println(obj.d);   // public - accessible everywhere
    }
}
