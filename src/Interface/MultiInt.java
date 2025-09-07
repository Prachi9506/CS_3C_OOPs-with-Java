package Interface;
interface A {
    void show();
}
interface AB {
    void show();
}
class C implements A, B {
    public void show() {   // Only one implementation needed
        System.out.println("Hello from C");
    }
}
public class MultiInt {
    public static void main(String[] args) {
        C obj = new C();//In both cases, C’s implementation is executed, because           
        //Java uses the actual object’s method, not the
        //interface’s declaration.
        obj.show();
    }
}