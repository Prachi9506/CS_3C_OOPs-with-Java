package package2;
import package1.Parent;
public class Child extends Parent {
    public void showAccess() {
        //System.out.println(a); //not accessible
        //System.out.println(b);  //not accessible
        System.out.println(c);   //  protected
        System.out.println(d);   // public
           }
        public static void main(String[] args) {
         Child obj = new Child();
         obj.showAccess();
         }
    }
