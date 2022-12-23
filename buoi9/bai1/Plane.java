
public class Plane extends Transportation {
    private String fuel; // nhien lieu

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Plane() {

    }

    public Plane(String fuel) {
        this.fuel = fuel;
    }

    public Plane(String fuel, String kindOfTransport, Manufacturer manufacturer) {
        super(kindOfTransport, manufacturer);
        this.fuel = fuel;
    }

    public void takeOff() {
        // cat canh
    }

    public void land() {
        // ha canh
    }

    @Override
    public double gotSpeed() { // lay toc do
        return 972.3f;
    }

    public String toString() {
        return "Plane: " + super.toString() + " - fuel: " + this.fuel + " - speed: " + this.gotSpeed() + "km/h";
    }

}
