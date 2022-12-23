import java.util.ArrayList;
import java.util.Scanner;

public class Cage { // chuong
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    ArrayList<Animal> AnimalList = new ArrayList<>();

    public void deleteAnimal(String name) {
        AnimalList.remove(name);
    }

    public void insertAnimal(Animal a) {
        AnimalList.add(a);
    }

    public static Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Id: ");
        this.setId(sc.nextInt());
    }
}
