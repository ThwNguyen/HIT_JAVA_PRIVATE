import java.util.Scanner;

public class Staff {
    private String name;
    private int age;
    private String sex;
    private String addr;
    private double hoursWorked;
    private double hourlyRate;
    private double salary;
    private double tax;

    private static Scanner sc = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 45)
            hoursWorked = 45 + (hoursWorked - 45) * 1.5;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = hourlyRate * hoursWorked;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        if (salary <= 300)
            this.tax = 0;
        else
            this.tax = (salary - 300) * 2 / 100;
    }

    public Staff() {

    }

    public void input() {
        System.out.print("Ho ten: ");
        setName(sc.nextLine());
        System.out.print("Tuoi: ");
        setAge(sc.nextInt());
        sc.nextLine();
        System.out.print("Gioi tinh: ");
        setSex(sc.nextLine());
        System.out.print("Dia chi: ");
        setAddr(sc.nextLine());
        System.out.print("So gio lam viec: ");
        setHoursWorked(sc.nextDouble());
        System.out.print("So tien 1h lam viec: ");
        setHourlyRate(sc.nextDouble());
        sc.nextLine();
        setSalary(salary);
        setTax(tax);
    }

    public void output() {
        System.out.printf("%-20s %-10d %-10s %-20s %-20.2f %-20.2f %-15.2f %-10.2f %-20.2f\n",
                getName(), getAge(), getSex(), getAddr(), getHoursWorked(), getHourlyRate(),
                getSalary(), getTax(), getSalary() - getTax());
    }

    public static void sortHours(Staff[] sf, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (sf[i].getHoursWorked() < sf[j].getHoursWorked()) {
                    Staff temp = sf[i];
                    sf[i] = sf[j];
                    sf[j] = temp;
                }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Staff[] sf = new Staff[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nhan vien " + (i + 1) + ":");
            sf[i] = new Staff();
            sf[i].input();
        }

        System.out.println("-----------MENU---------");
        System.out.println("1.Them moi nhan vien");
        System.out.println("2.Hien thi danh sach nhan vien");
        System.out.println("3.Hien thi 3 nhan vien cham chi nhat");
        System.out.println("4.Tim kiem nhan vien");
        System.out.println("5.Thoat");
        System.out.print("Chon 1 yeu cau: ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                Staff sf1 = new Staff();
                System.out.println("Nhap thong tin nhan vien moi");
                sf1.input();
                sf[n++] = sf1;
                break;
            case 2:
                System.out.printf("%-20s %-10s %-10s %-20s %-20s %-20s %-15s %-10s %-20s\n", "Ho ten",
                        "Tuoi", "Gioi Tinh", "Dia chi", "So gio lam viec", "Luong/h", "Luong", "Thue", "Tong");
                for (int i = 0; i < n; i++)
                    sf[i].output();
                break;
            case 3:
                sortHours(sf, n);
                int count = 0;
                System.out.printf("%-20s %-10s %-10s %-20s %-20s %-20s %-15s %-10s\n", "Ho ten",
                        "Tuoi", "Gioi Tinh", "Dia chi", "So gio lam viec", "Luong/h", "Luong", "Thue", "Tong");
                for (int i = 0; i < n; i++) {
                    sf[i].output();
                    count++;
                    if (count == 3)
                        break;
                }
                break;
            case 4:
                sc.nextLine();
                System.out.println("Nhap nhan vien can tim");
                String s = sc.nextLine();
                System.out.printf("%-20s %-10s %-10s %-20s %-20s %-20s %-15s %-10s\n", "Ho ten",
                        "Tuoi", "Gioi Tinh", "Dia chi", "So gio lam viec", "Luong/h", "Luong", "Thue", "Tong");
                for (int i = 0; i < n; i++)
                    if (s.equalsIgnoreCase(sf[i].getName()))
                        sf[i].output();
                break;
            default:
                break;
        }

    }

}
