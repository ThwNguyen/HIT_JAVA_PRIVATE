public abstract class Transportation {
    private String kindOfTransport; // loai phuong tien
    private Manufacturer manufacturer; // hang san xuat

    public String getKindOfTransport() {
        return kindOfTransport;
    }

    public void setKindOfTransport(String kindOfTransport) {
        this.kindOfTransport = kindOfTransport;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Transportation() {

    }

    public Transportation(String kindOfTransport, Manufacturer manufacturer) {
        this.kindOfTransport = kindOfTransport;
        this.manufacturer = manufacturer;
    }

    public String gotNameOfManufacturer() { // lay ten hang san xuat
        return this.manufacturer.getNameOfManufacture();
    }

    public void start() {

    }

    public void speedUp() {

    }

    public void stop() {

    }

    public abstract double gotSpeed(); // lay toc do

    public String toString() {
        return "kind of transportation: " + this.kindOfTransport + ", " + this.manufacturer;
    }
}
