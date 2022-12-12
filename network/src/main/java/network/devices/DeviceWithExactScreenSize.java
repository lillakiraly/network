package network.devices;

import network.devices.properties.ScreenSize;

import java.util.ArrayList;
import java.util.List;

public abstract class DeviceWithExactScreenSize extends Device {
    protected ScreenSize screenSize;
    protected static List<DeviceWithExactScreenSize> allCreatedInstances = new ArrayList<>();

    public DeviceWithExactScreenSize(int yearlyPowerLoss, int age, int batteryLife, ScreenSize screenSize) {
        super(yearlyPowerLoss, age, batteryLife);
        this.screenSize = screenSize;
    }
}
