package network.devices;

public abstract class Device {
    protected static int numOfAllInstances = 0;
    protected int yearlyPowerLoss;
    protected int age;
    protected int batteryLife;

    public Device(int yearlyPowerLoss, int age, int batteryLife) {
        this.yearlyPowerLoss = yearlyPowerLoss;
        this.age = age;
        this.batteryLife = batteryLife;
        numOfAllInstances++;
    }

    public abstract void ageUp();

    @Override
    public String toString() {
        return "Device{" +
                "yearlyPowerLoss=" + yearlyPowerLoss +
                ", age=" + age +
                ", batteryLife=" + batteryLife +
                '}';
    }
}