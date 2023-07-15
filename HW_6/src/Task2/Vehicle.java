package Task2;

public abstract class Vehicle {
    int maxSpeed;
    double ratio;
    
    public Vehicle(int maxSpeed, double ratio) {
        this.maxSpeed = maxSpeed; // максимальная скорость
        this.ratio = ratio; // коэффициент допустимой скорости
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public double getRatio() {
        return ratio;
    }

}
