import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Instantiate employees
        Employee monthly1 = new MonthlyEmployee("Adam", 5000.0);
        Employee monthly2 = new MonthlyEmployee("Bruce", 7500.0);

        Employee hourly1 = new HourlyEmployee("Charles", 37.0, 150.0);
        Employee hourly2 = new HourlyEmployee("Diane", 40.5, 135.0);

        Employee commission1 = new CommissionEmployee("Emma", 20000.0, 10000.0, 0.20);
        Employee commission2 = new CommissionEmployee("Fitzgerald", 100000.0, 50000.0, 0.50);

        // Add to list
        employees.add(monthly1);
        employees.add(monthly2);
        employees.add(hourly1);
        employees.add(hourly2);
        employees.add(commission1);
        employees.add(commission2);

        // Display list
        for (Employee e : employees){
            System.out.println(e);
        }
    }
}
