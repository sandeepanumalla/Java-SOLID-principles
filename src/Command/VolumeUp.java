package Command;

public class VolumeUp implements Command {
    private ElectronicDevice device;
    VolumeUp(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.volumeUp();
    }
    
}
