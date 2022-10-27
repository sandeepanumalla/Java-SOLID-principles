package Command;

public class TurnTvOn implements Command{
    private ElectronicDevice device;
    TurnTvOn(ElectronicDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
       device.on();  
    }
    
}
