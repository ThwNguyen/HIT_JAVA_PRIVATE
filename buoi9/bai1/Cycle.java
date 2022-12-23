public class Cycle extends Transportation {
    public Cycle() {

    }

    public Cycle(String kindOfTransport, Manufacturer manufacturer) {
        super(kindOfTransport, manufacturer);
    }

    @Override
    public double gotSpeed() {
        return 15f;
    }

    public String toString() {
        return "Cycle: " + super.toString() + " fuel: human and rice - speed: " + this.gotSpeed() + "km/h";
    }

}
