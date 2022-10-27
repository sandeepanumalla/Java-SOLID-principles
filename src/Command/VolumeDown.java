package Command;

public class VolumeDown implements Command {
    private ElectronicDevice device;
    VolumeDown(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeDown();
    }
    
}
