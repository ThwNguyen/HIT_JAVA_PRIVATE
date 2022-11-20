import java.util.Scanner;

public class Student {
    private int id;
    public int count = 1;
    private String name;
    private String addr;
    private String phone;
    private double score;

    private static Scanner sc = new Scanner(System.in);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {
        id = 0;
        name = "No Name";
        addr = "No Address";
        phone = null;
        score = 0;
    }

    public Student(int id, String name, String addr, String phone, double score) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.phone = phone;
        this.score = score;
    }

    public String toString() {
        return String.format("%-10d %-15s %-20s %-20s %-10.2f\n", id, name, addr, phone, score);
    }

    public void input() {
        setId(count++);
        System.out.print("Ho ten: ");
        setName(sc.nextLine());
        System.out.print("Dia chi: ");
        setAddr(sc.nextLine());
        System.out.print("Dien thoai: ");
        setPhone(sc.nextLine());
        System.out.print("Diem so: ");
        setScore(sc.nextDouble());
    }

    public static void arrangeScore(Student[] st, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (st[i].getScore() > st[j].getScore()) {
                    Student temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }

    }

    public static String Name(String a) {
        return a.substring(a.lastIndexOf(" "), a.length() - 1);
    }

    public static void arrangeName(Student[] st, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (Name(st[i].getName()).compareToIgnoreCase(Name(st[j].getName())) > 0) {
                    Student temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] st = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + ":");
            st[i] = new Student();
            sc.nextLine();
            st[i].input();
        }

        System.out.println("----------MENU---------");
        System.out.println("1.Danh sach diem sinh vien");
        System.out.println("2.Tim kiem sinh vien");
        System.out.println("3.Sap xep sinh vien theo thu tu tang dan");
        System.out.println("4.Thoat ");
        System.out.println("chon mot yeu cau");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                arrangeScore(st, n);
                System.out.printf("%-10s %-15s %-20s %-10s %-10s\n", "Ma SV",
                        "Ho ten", "Dia chi", "Dien thoai", "Diem");
                for (int i = 0; i < n; i++)
                    System.out.println(st[i]);
                break;
            case 2:
                System.out.print("Nhap ten sinh vien can tim: ");
                String s = sc.nextLine();
                System.out.println("Thong tin: ");
                System.out.printf("%-10s %-15s %-20s %-10s %-10s\n", "Ma SV",
                        "Ho ten", "Dia chi", "Dien thoai", "Diem");
                for (int i = 0; i < n; i++)
                    if (st[i].getName().contains(s) &&
                            s.charAt(s.length() - 1) == st[i].getName().charAt(st[i].getName().length() - 1))
                        System.out.println(st[i]);
                break;
            case 3:
                arrangeName(st, n);
                System.out.printf("%-10s %-15s %-20s %-10s %-10s\n", "Ma SV",
                        "Ho ten", "Dia chi", "Dien thoai", "Diem");
                for (int i = 0; i < n; i++)
                    System.out.println(st[i]);
                break;
            default:
                break;
        }
    }
}
