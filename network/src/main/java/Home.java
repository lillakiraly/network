import network.Network;
import network.devices.properties.ScreenSize;

public class Home {
    public static void main(String[] args) {
        System.out.println("Hello");
        Network network = new Network();
        network.addLightweightDevice(10, 100);
        network.addNormalDevices(2000, 10, 100, ScreenSize.EDTV);
        network.addSmartDevice("Lilo", 12, 100, ScreenSize.HD);
        network.addSmartDevice("Lilo", 10, 10, ScreenSize.FULL_HD);

        network.ageUpDevices();
        System.out.println(network);
    }
}
