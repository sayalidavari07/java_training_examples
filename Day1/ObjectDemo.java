 package mydemos;

class TataCar {
    void start() {
        System.out.println("Car Started");
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        TataCar tataCar = new TataCar();
        tataCar.start();
    }
}