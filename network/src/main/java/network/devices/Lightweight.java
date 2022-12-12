package network.devices;

public class Lightweight extends Device {
    private int numOfLightweightDevices = 0;
    private static final int YEARLY_POWER_LOSS = 7;

    public Lightweight(int age, int batteryLife) {
        super(YEARLY_POWER_LOSS, age, batteryLife);
        numOfLightweightDevices++;
    }

    @Override
    public void ageUp() {
        batteryLife -= (yearlyPowerLoss + numOfAllInstances - 1);
    }

}
