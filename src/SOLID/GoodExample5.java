package SOLID;

// Abstraction (interface)
interface Switchable {
    void turnOn();
}
// Different devices implement the same interface
class Fan implements Switchable {
    public void turnOn() {
        System.out.println("Fan is running...");
    }
}
class Light implements Switchable {
    public void turnOn() {
        System.out.println("Light is glowing...");
    }
}
// Switch depends only on abstraction, not concrete devices
class Switch {
    private Switchable device;
    public Switch(Switchable device) {
        this.device = device;
    }
    public void press() {
        device.turnOn();
    }
}
public class GoodExample5 {
    public static void main(String[] args) {
        Switchable fan = new Fan();
        Switchable light = new Light();
        Switch s1 = new Switch(fan);
        s1.press(); // Fan is running...
        Switch s2 = new Switch(light);
        s2.press(); // Light is glowing...
    }
}