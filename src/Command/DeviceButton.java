package Command;

public class DeviceButton  {
    Command newCommand;
    DeviceButton(Command newCommand){
        this.newCommand = newCommand;
    }

    void onPress(){
        newCommand.execute();
    }
}
