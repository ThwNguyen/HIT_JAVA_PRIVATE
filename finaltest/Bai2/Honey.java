import java.util.*;

public class Honey extends Person {
    private String id;
    private boolean status;
    private List<Favorite> favor = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Honey(String id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public List<Favorite> getFavor() {
        return favor;
    }

    public void setFavor(List<Favorite> favor) {
        this.favor = favor;
    }

    public Honey(String name, int age, String gender, String phone, String id, boolean status, List<Favorite> favor) {
        super(name, age, gender, phone);
        this.id = id;
        this.status = status;
        this.favor = favor;
    }

    public Honey() {

    }

    public void output() {
        System.out.printf("%-15s %-10d %-10s %-15s %-10s %-20s", super.getName(), super.getAge(), super.getGender(),
                super.getPhone(), getId(), getStatus());

    }

}
