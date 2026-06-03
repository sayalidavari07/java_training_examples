package oopconcept;

interface RemoteControl {
    void turnOn();
    void turnOff();
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV Turned ON");
    }

    public void turnOff() {
        System.out.println("TV Turned OFF");
    }
}

class AirConditioner implements RemoteControl {
    public void turnOn() {
        System.out.println("AC Turned ON");
    }

    public void turnOff() {
        System.out.println("AC Turned OFF");
    }
}

public class RemoteDemo {
    public static void main(String[] args) {
        RemoteControl r1 = new TV();
        RemoteControl r2 = new AirConditioner();

        r1.turnOn();
        r1.turnOff();

        r2.turnOn();
        r2.turnOff();
    }
}