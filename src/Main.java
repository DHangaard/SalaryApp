import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Instantiate employees and add to list
        employees.add(new MonthlyEmployee("Anders", 5000.0));
        employees.add(new MonthlyEmployee("Birgitte", 7500.0));

        employees.add(new HourlyEmployee("Christian", 37.0, 150.0));
        employees.add(new HourlyEmployee("Dorthe", 40.5, 135.0));

        employees.add(new CommissionEmployee("Erik", 20000.0, 10000.0, 0.20));
        employees.add(new CommissionEmployee("Freja", 100000.0, 50000.0, 0.50));

        // Display list
        for (Employee e : employees){
            System.out.println(e);
            System.out.println(); // Empty line
        }
    }
}
