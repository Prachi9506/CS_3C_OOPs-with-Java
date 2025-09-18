package SOLID;

/// Abstraction (interface)
interface Switchable {
    void turnOn();  //the abstraction does not depend on details.
}
// Different devices implement the same interface
class Fan implements Switchable {   //Lower Level class
    public void turnOn() {
        System.out.println("Fan is running...");
    }
}
class Light implements Switchable {  //Lower Level class
    public void turnOn() {
        System.out.println("Light is glowing...");
    }
}
//Details should depend on abstractions" is ensured because Fan and Light must implement Switchable.
// Switch depends only on abstraction, not concrete devices
class Switch {   //Higher Level class as It depends only on the Switchable abstraction, not on Fan or Light
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
        Switchable fan = new Fan();   //I have a Switchable device, and right now it’s a Fan
        Switchable light = new Light();  //I have a Switchable device, and right now it’s a Light
        Switch s1 = new Switch(fan);
        s1.press(); // Fan is running...
        Switch s2 = new Switch(light);
        s2.press(); // Light is glowing...
    }
}
//If tomorrow you add a new device like TV implements Switchable, you don’t need to change the Switch class.
//You just pass a TV object while constructing the Switch.