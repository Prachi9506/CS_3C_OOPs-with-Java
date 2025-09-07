package SOLID;

interface Workable { void work(); }
interface Eatable  { void eat(); }
class Human implements Workable, Eatable {
    public void work() { System.out.println("Human is working."); }
    public void eat()  { System.out.println("Human is eating."); }
}
class Robot implements Workable {
    public void work() { System.out.println("Robot is working."); }
}
public class S4ISPExample {
    public static void main(String[] args) {
        Workable h = new Human();
        Workable r = new Robot();
        h.work(); // Human is working
        r.work(); // Robot is working
        Eatable e = new Human();
        e.eat();  // Human is eating
    }
}

