import java.util.Scanner;

public class Car {
    private String owner;
    private String name;
    private String brand;
    private double price;
    private double year;
    private double realPrice;

    private static Scanner sc = new Scanner(System.in);

    public Car() {

    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(double realPrice) {
        double percent;
        if (price < 1000000000)
            percent = 0.07;
        else if (price > 2000000000)
            percent = 0.03;
        else
            percent = 0.05;
        this.realPrice = price - (price * percent * year);
    }

    public void input() {
        System.out.print("Chu so huu: ");
        setOwner(sc.nextLine());
        System.out.print("Ten xe: ");
        setName(sc.nextLine());
        System.out.print("Hang: ");
        setBrand(sc.nextLine());
        System.out.print("Gia: ");
        setPrice(sc.nextDouble());
        System.out.print("Nam su dung: ");
        setYear(sc.nextDouble());
        setRealPrice(realPrice);
    }

    public void output() {
        System.out.printf("%-15s %-15s %-15s %-15.2f %-15.2f %-15.2f\n", getOwner(),
                getName(), getBrand(), getPrice(), getYear(), getRealPrice());

    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Car[] c = new Car[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Xe thu " + (i + 1) + ":");
            c[i] = new Car();
            c[i].input();
        }
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",
                "Chu so huu", "Ten xe", "Hang", "Gia", "Nam su dung",
                "Gia tri hien tai");
        for (int i = 0; i < n; i++)
            c[i].output();
    }

}