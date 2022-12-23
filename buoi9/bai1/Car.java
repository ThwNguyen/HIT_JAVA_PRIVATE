public class Car extends Transportation {
    private String fuel;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Car() {

    }

    public Car(String fuel) {
        this.fuel = fuel;
    }

    public Car(String fuel, String kindOfTransport, Manufacturer manufacturer) {
        super(kindOfTransport, manufacturer);
        this.fuel = fuel;
    }

    @Override
    public double gotSpeed() {
        return 70f;
    }

    public String toString() {
        return "Car: " + super.toString() + " - fuel: " + this.fuel + " - speed: " + this.gotSpeed() + "km/h";
    }

}
