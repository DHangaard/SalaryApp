public class MonthlyEmployee extends Employee{

    // Attributes
    private double salary;

    // Constructor
    MonthlyEmployee(String name, double salary){
        super.name = name;
        this.salary = salary;
    }

    // Methods
    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public String toString(){
        String message = buildPaycheckDetails();
        return message;
    }

    public String buildPaycheckDetails(){
        String salary = String.format("%.2f,-", calculateSalary()); // Display salary with two decimals

        String message = this.name + "'s paycheck:" +
                        "\nStatus: Paid monthly" +
                        "\nSalary: " + salary;
        return message;
    }
}
