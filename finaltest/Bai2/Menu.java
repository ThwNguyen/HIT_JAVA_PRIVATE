import java.util.*;

import javax.xml.transform.Source;

public class Menu implements Service {
    public List<Honey> list;
    public Scanner sc = new Scanner(System.in);

    public List<Honey> getList() {
        return list;
    }

    public void setList(List<Honey> list) {
        this.list = list;
    }

    public Menu(List<Honey> list) {
        this.list = list;
    }

    public void addHoney(Honey h) {
        for (Honey honey : list)
            if (honey.getId().equals(h.getId())) {
                System.out.println("Honey already exists");
                return;
            }
        list.add(h);
    }

    public void delHoney(String id) {
        for (Honey honey : list)
            if (honey.getId().equals(id)) {
                list.remove(honey);
                return;
            }
        System.out.println("Honey not found");
    }

    public void editHoney(String id) {
        Honey honey = new Honey();
        for (Honey h : list)
            if (h.getId().equals(id)) {
                honey = h;
                break;
            }

        System.out.println("What do you wanna edit? \n1.name \n2.age \n3.phone \n4.status \nChoose: ");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                System.out.print("Enter name : ");
                honey.setName(sc.nextLine());
            case 2:
                System.out.print("Enter age : ");
                honey.setAge(sc.nextInt());
                sc.nextLine();
            case 3:
                System.out.print("Enter phone : ");
                honey.setPhone(sc.nextLine());
            case 4:
                System.out.print("Enter status : ");
                honey.setStatus(sc.nextBoolean());
        }
    }

    public void showAll() {
        for (Honey h : list)
            h.output();
    }

    public void addFavorite(Favorite f, String id) {
        for (Honey h : list)
            if (h.getId().equals(id)) {
                h.getFavor().add(f);
                return;
            }
    }

    public List<Honey> sortedHoney() {
        List<Honey> sorted = new ArrayList<>();
        Collections.sort(sorted, new sortedByName().reversed());
        return sorted;
    }
}

class sortedByName implements Comparator<Honey> {
    public int compare(Honey h1, Honey h2) {
        return h1.getName().compareTo(h2.getName());
    }
}
