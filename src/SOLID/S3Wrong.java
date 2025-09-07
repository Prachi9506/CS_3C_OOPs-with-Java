package SOLID;

class Bird {
    public void eat() { System.out.println("This bird eats food."); }
    public void fly() { System.out.println("This bird flies."); }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}
public class S3Wrong {
    public static void main(String[] args) {
        Bird b = new Penguin();
        b.fly();
    }
}
