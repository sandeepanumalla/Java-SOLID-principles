package Command;

public class TurnTvOff implements Command {
    private ElectronicDevice device;
    TurnTvOff(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.off();
    }
    
}
