package network.devices;

import network.devices.properties.ScreenSize;

public class Normal extends DeviceWithExactScreenSize {
    private static final int YEARLY_POWER_LOSS = 3;
    private static final int YEAR_THAT_AFFECT_POWER = 2000;
    private final int yearOfManufacture;

    public Normal(int yearOfManufacture, int age, int batteryLife, ScreenSize screenSize) {
        super(YEARLY_POWER_LOSS, age, batteryLife, screenSize);
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public void ageUp() {
        batteryLife -= yearlyPowerLoss;
        batteryLife = checkIfManufacturedBeforeYearThatAffectsPower() ?
                batteryLife / 2 : batteryLife * 2;
    }

    private boolean checkIfManufacturedBeforeYearThatAffectsPower() {
        return yearOfManufacture < YEAR_THAT_AFFECT_POWER;

    }
}
