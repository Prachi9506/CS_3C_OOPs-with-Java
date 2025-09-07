package SOLID;

class Bird {
    public void eat() {
        System.out.println("This bird eats food.");
    }
}
class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow can fly.");
    }
}
class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin swims instead of flying.");
    }
}
public class S3 {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();   // Using Sparrow as a Bird
        Bird b2 = new Penguin();   // Using Penguin as a Bird
        b1.eat();  //  works correctly
        b2.eat();  //  works correctly
    }
}