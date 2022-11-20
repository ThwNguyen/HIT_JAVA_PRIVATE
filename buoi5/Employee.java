import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String type;
    private int workDays;
    private int startYear;
    private int allowance;
    private int salary;

    private Scanner sc = new Scanner(System.in);

    public Employee() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setAllowance(int allowance) {
        allowance = 100000;
        if (2022 - startYear == 0)
            this.allowance = allowance;
        else
            for (int i = 1; i < (2022 - startYear); i++)
                this.allowance += 200000 * i;
    }

    public int getAllowance() {
        return allowance;
    }

    public void setSalary(int salary) {
        if (type.compareToIgnoreCase("san xuat") == 0)
            this.salary = 350000 * workDays;
        else
            this.salary = 400000 * workDays;
    }

    public int getSalary() {
        return salary;
    }

    public void input() {
        System.out.print("ID : ");
        setId(sc.nextLine());
        System.out.print("Ho ten : ");
        setName(sc.nextLine());
        System.out.print("Kieu nhan vien : ");
        setType(sc.nextLine());
        System.out.print("So ngay lam : ");
        setWorkDays(sc.nextInt());
        System.out.print("Nam bat dau : ");
        setStartYear(sc.nextInt());
        getAllowance();
        getSalary();
    }

    public void output() {
        System.out.printf("%-15s %-15s %-15s %-15d %-15d %-15d %-15d %-15d\n",
                getId(), getName(), getType(),
                getWorkDays(), getStartYear(), getAllowance(), getSalary(),
                getAllowance() + getSalary());
    }

    public static void main(String[] args) {
        Employee[] em = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhan vien " + (i + 1) + ": ");
            em[i] = new Employee();
            em[i].input();
        }

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n",
                "ID", "Ho ten", "Kieu nhan vien",
                "So ngay lam", "Nam vao lam", "Phu Cap", "Luong", "Tong tien");
        for (int i = 0; i < 5; i++)
            em[i].output();
    }
}