package oopconcept;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    public void takePhoto() {
        System.out.println("Photo Captured");
    }

    public void playMusic() {
        System.out.println("Music Playing");
    }
}

public class SmartPhoneDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}