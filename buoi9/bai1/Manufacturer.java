public class Manufacturer {
    private String nameOfManufacture; // ten hang san xuat
    private String country; // ten nuoc san xuat

    public String getNameOfManufacture() {
        return nameOfManufacture;
    }

    public void setNameOfManufacture(String nameOfManufacture) {
        this.nameOfManufacture = nameOfManufacture;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Manufacturer() {

    }

    public Manufacturer(String nameOfManufacture, String country) {
        this.nameOfManufacture = nameOfManufacture;
        this.country = country;
    }

    public String toString() {
        return "Manufacture: " + this.nameOfManufacture + ", " + this.country;
    }

}
