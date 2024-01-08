
import java.util.Scanner;

public class Employee {
    private String name, email;
    private int hourRate, capacity, freeDays;
    public Employee() {
    }
    public Employee(String name, String email, int hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }
    public int calculateDailyIncome() {
        return hourRate * capacity;
    }
    public int calculateMonthlyIncome() {
        return ((hourRate * capacity) * 30) - freeDays*hourRate;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getHourRate() {
        return hourRate;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getFreeDays() {
        return freeDays;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setFreeDays(int freeDays) {
        this.freeDays = freeDays;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdu cati angajati sunt: ");
        int N = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Introdu numele angajatului: ");
            String name = scanner.nextLine();
            System.out.print("Introdu emailul angajatului: ");
            String email = scanner.nextLine();
            System.out.print("Introdu tariful pe ora: ");
            int tarif = Integer.parseInt(scanner.nextLine());
            System.out.print("Introdu cate ore lucreaza pe zi: ");
            int capacity = Integer.parseInt(scanner.nextLine());
            System.out.print("Introdu cate zile libere are: ");
            int liber = Integer.parseInt(scanner.nextLine());
            employees[i] = new Employee(name, email, tarif, capacity, liber);
        }
        for (Employee employee : employees) {
            System.out.println("Salariul angajatului " + employee.getName() + " este: ");
            System.out.println(employee.calculateMonthlyIncome());
        }
        scanner.close();
    }
}

