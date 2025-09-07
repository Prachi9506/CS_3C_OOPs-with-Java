package Interface;
interface MyInterface {
    public static final int x = 10;
}
class Interface4 implements MyInterface {

    public static void main(String[] args) {
        // MyInterface i=new Interface4();
        System.out.println(MyInterface.x);
        //i.x=20;

    }
}
