package SOLID;

class Fan {
    public void start() {
        System.out.println("Fan is running...");
    }
}
class Switch {
    private Fan fan = new Fan(); // directly depends on Fan

    public void turnOn() {
        fan.start();
    }
}
public class BadExample5 {
    public static void main(String[] args) {
        Switch s = new Switch();
        s.turnOn(); // works only with Fan
    }
}