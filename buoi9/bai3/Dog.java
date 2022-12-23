import java.util.Scanner;

public class Dog extends Animal {
    public void showInfor() {
        System.out.printf("%-15s %-10d %-20s", super.getName(), super.getAge(), super.getDetails());
    }

    public void chirp() {
        System.out.println("goaw goaw");
    }

    public Dog() {

    }

    public Dog(String name, int age, String details) {
        super(name, age, details);
    }

    public static Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Name: ");
        super.setName(sc.nextLine());
        System.out.println("Age: ");
        super.setAge(sc.nextInt());
        System.out.println("Details: ");
        super.setDetails(sc.nextLine());
    }

}
