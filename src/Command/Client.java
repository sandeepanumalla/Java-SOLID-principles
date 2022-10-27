package Command;

public class Client {
    public static void main(String[] args) {
        ElectronicDevice device = TvRemote.getDevice();
        DeviceButton button = new DeviceButton(new TurnTvOn(device));
        button.onPress();

        DeviceButton tvOff = new DeviceButton(new TurnTvOff(device));
        tvOff.onPress();

        DeviceButton volumeUp = new DeviceButton(new VolumeUp(device));
        volumeUp.onPress();

    }
}
