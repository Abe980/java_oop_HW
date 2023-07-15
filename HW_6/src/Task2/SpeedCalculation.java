package Task2;

public class SpeedCalculation {
    /**
     * @param vehicle транспортное средство
     * @return допустимую скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getRatio();
    }
}
