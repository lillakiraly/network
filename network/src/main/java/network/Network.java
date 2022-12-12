package network;

import network.devices.Device;
import network.devices.Lightweight;
import network.devices.Normal;
import network.devices.Smart;
import network.devices.properties.ScreenSize;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Device> devices;

    public Network() {
        devices = new ArrayList<>();
    }

    public void addSmartDevice(String name, int age, int batteryLife, ScreenSize screenSize) {
        if (!checkIfSmartDeviceNameIsTaken(name)) {
            devices.add(new Smart(name, age, batteryLife, screenSize));
        }
    }


    public void addLightweightDevice(int age, int batteryLife) {
        devices.add(new Lightweight(age, batteryLife));

    }


    public void addNormalDevices(int yearOfManufacture, int age, int batteryLife, ScreenSize screenSize) {
        devices.add(new Normal(yearOfManufacture, age, batteryLife, screenSize));
    }

    private boolean checkIfSmartDeviceNameIsTaken(String name) {
        return devices.stream().filter(device -> device instanceof Smart)
                .map(device -> (Smart) device)
                .anyMatch(device -> device.getName().equals(name));
    }

    public void ageUpDevices() {
        devices.forEach(Device::ageUp);
    }

    @Override
    public String toString() {
        return "Network{" +
                "devices=" + devices +
                '}';
    }
}
