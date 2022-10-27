package Command;

public class Television implements ElectronicDevice {
    private int volume = 10;

    @Override
    public void on() {
        System.out.println("Tv is turned on");
    }

    @Override
    public void off() {
        System.out.println("Tv is turned off");
        
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Current volume is "+volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Current volume is "+volume);
    }
    
}
