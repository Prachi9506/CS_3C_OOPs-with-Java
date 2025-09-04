class A {
    void show() {
        System.out.println("A's show");
    }
}
class B {
    void show() {
        System.out.println("B's show");
    }
}
class C extends A, B {   // Imagine if this was allowed
}
public class MultiInt1 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}