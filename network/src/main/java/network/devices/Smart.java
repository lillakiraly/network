package network.devices;

import network.devices.properties.ScreenSize;

import java.util.List;
import java.util.stream.Collectors;

public class Smart extends DeviceWithExactScreenSize {
    private String name;
    private static final int YEARLY_POWER_LOSS = 15;

    public Smart(String name, int age, int batteryLife, ScreenSize screenSize) {
        super(YEARLY_POWER_LOSS, age, batteryLife, screenSize);
        this.name = name;
    }

    @Override
    public void ageUp() {
        batteryLife -= (yearlyPowerLoss + screenSize.getYearlyPowerLoss());
    }

    public List<Normal> getNormalDevicesWithDifferingPower(int powerDifference) {
        return allCreatedInstances.stream().filter(device -> device instanceof Normal)
                .map(device -> (Normal) device)
                .filter(device ->
                Math.abs(device.batteryLife - this.batteryLife) == powerDifference).collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }
}
