interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Phone taking Picture..!");
    }

    @Override
    public void playMusic() {
        System.out.println("Phone Playing music...!");
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        SmartPhone ph1 = new SmartPhone();

        ph1.playMusic();
        ph1.takePhoto();
    }

}
