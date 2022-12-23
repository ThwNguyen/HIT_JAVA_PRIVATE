import java.util.Scanner;
import java.util.ArrayList;

public class TestZoo {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Menu menu = new Menu();
        do {
            System.out.println(
                    "Choose 1 require: \n1.Add cage\n2.Remove cage\n3.Add animal\n4.Remove animal\n5.Show all animals\n6.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    menu.insertCage(zoo);
                    break;
                case 2:
                    menu.deleteCage(zoo);
                    break;
                case 3:
                    menu.insertAnimal(zoo);
                    break;
                case 4:
                    menu.deleteAnimal(zoo);
                    break;
                case 5:
                    menu.showAll(zoo);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("choose again");
            }
        } while (true);
    }

}
