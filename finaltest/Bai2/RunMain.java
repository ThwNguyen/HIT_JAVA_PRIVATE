import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Honey> list = new ArrayList<>();
        Service ser = new Menu(list);

        do {
            System.out.println("=========Menu=========");
            System.out.println(
                    "1. add honey \n2.delete honey \n3.edit honey \n4.show all honeys \n5. add favorite \n6.sort honey by name \n7.exit");
            System.out.println("Choose 1 require : ");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    Honey honey = new Honey();
                    ser.addHoney(honey);
                case 2:
                    System.out.println("Enter id : ");
                    String id = sc.nextLine();
                    ser.delHoney(id);
                case 3:
                    System.out.println("Enter id : ");
                    String id2 = sc.nextLine();
                    ser.editHoney(id2);
                case 4:
                    ser.showAll();
                case 5:
                    ser.addFavorite(null, null);
                case 6:
                    List<Honey> sorted = ser.sortedHoney();
                    for (Honey h : sorted)
                        System.out.println(h);
                case 7:
                    return;
                default:
                    break;
            }

        } while (true);

    }
}
