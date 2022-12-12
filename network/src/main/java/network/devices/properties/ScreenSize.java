package network.devices.properties;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULL_HD(15),
    UHD(20);
    private int yearlyPowerLoss;

    ScreenSize(int yearlyPowerLoss) {
        this.yearlyPowerLoss = yearlyPowerLoss;
    }

    public int getYearlyPowerLoss() {
        return yearlyPowerLoss;
    }
}
