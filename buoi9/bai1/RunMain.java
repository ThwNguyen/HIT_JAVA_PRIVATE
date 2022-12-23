import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Transportation> trans = new ArrayList<>();
        trans.add(new Plane("Gasoline", "Air", new Manufacturer("VietNam Air Line", "Viet Nam")));
        trans.add(new Car("Gasoline", "Road", new Manufacturer("Lamborghini", "Italy")));
        trans.add(new Cycle("Road", new Manufacturer("Trek", "USA")));
        double max = trans.get(0).gotSpeed();
        for (int i = 0; i < trans.size(); i++)
            max = Math.max(trans.get(i).gotSpeed(), max);
        for (int i = 0; i < trans.size(); i++)
            if (max == trans.get(i).gotSpeed())
                System.out.println("The kind of transportation has the max speed: \n" + trans.get(i));

    }
}
