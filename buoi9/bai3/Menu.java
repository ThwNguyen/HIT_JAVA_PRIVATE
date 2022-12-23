import java.util.Scanner;

public class Menu implements ChoiceZoo {

    public static Scanner sc = new Scanner(System.in);

    public void insertCage(Zoo zoo) {
        Cage c = new Cage();
        c.input();
        zoo.CageList.add(c);
    }

    public void insertAnimal(Zoo zoo) {
        System.out.println("Enter the id of cage you want to add: ");
        int temp = sc.nextInt();
        int count = 0;
        for (int i = 0; i < zoo.CageList.size(); i++)
            if (temp == zoo.CageList.get(i).getId()) {
                count++;
                System.out.println("Enter name of animal to add: ");
                String temp1;
                do {
                    System.out.println("Enter one of these animals (Tiger, Cat, Dog): ");
                    temp1 = sc.nextLine();
                } while (temp1.compareToIgnoreCase("Tiger") != 0 && temp1.compareToIgnoreCase("Dog") != 0
                        && temp1.compareToIgnoreCase("Cat") != 0);

                if (temp1.compareToIgnoreCase("Tiger") == 0) {
                    Animal a = new Tiger();
                    Tiger t = (Tiger) a;
                    t.input();
                    zoo.CageList.get(i).AnimalList.add(a);
                }

                if (temp1.compareToIgnoreCase("Dog") == 0) {
                    Animal a = new Dog();
                    Dog d = (Dog) a;
                    d.input();
                    zoo.CageList.get(i).AnimalList.add(a);
                }

                if (temp1.compareToIgnoreCase("Cat") == 0) {
                    Animal a = new Tiger();
                    Cat cat = (Cat) a;
                    cat.input();
                    zoo.CageList.get(i).AnimalList.add(a);
                }

                break;
            }
        if (count == 0)
            System.out.println("Cage's not exist");
    }

    public void deleteCage(Zoo zoo) {
        System.out.println("Enter the id of cage you want to remove: ");
        int m = sc.nextInt();
        if (!zoo.CageList.isEmpty()) {
            int n = zoo.CageList.size();
            for (int i = 0; i < n; i++)
                if (m == zoo.CageList.get(i).getId()) {
                    zoo.delCage(zoo.CageList.get(i).getId());
                    break;
                }

            if (n == zoo.CageList.size())
                System.out.println("Cage is not exist");
            else
                System.out.println("Removed");
        }
    }

    public void deleteAnimal(Zoo zoo) {
        System.out.println("Enter name of animal to remove: ");
        String name = sc.nextLine();
        int count = 0;
        if (!zoo.CageList.isEmpty()) {
            for (int i = 0; i < zoo.CageList.size(); i++)
                for (int j = 0; j < zoo.CageList.get(i).AnimalList.size(); j++)
                    if (zoo.CageList.get(i).AnimalList.get(j).getName().compareToIgnoreCase(name) == 0) {
                        count++;
                        zoo.CageList.get(i).AnimalList.remove(zoo.CageList.get(i).AnimalList.get(j));
                        break;
                    }
            if (count == 0)
                System.out.println("This animal is not exist");
            else
                System.out.println("REMOVED");
        }
    }

    public void showAll(Zoo zoo) {
        for (int i = 0; i < zoo.CageList.size(); i++) {
            System.out.println("Id: " + zoo.CageList.get(i).getId());
            System.out.printf("%-15s %-15s %-15s\n", "Name", "Age", "Details");
            for (int j = 0; j < zoo.CageList.get(i).AnimalList.size(); j++)
                zoo.CageList.get(i).AnimalList.get(j).showInfor();
        }
    }

}