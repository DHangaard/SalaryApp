public class HourlyEmployee extends Employee{

    // Attributes
    private double numberOfHours;
    private double payPrHour;

    // Constructor
    HourlyEmployee(String name, double numberOfHours, double payPrHour){
        super.name = name;
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }

    // Methods
    @Override
    public double calculateSalary(){
        double salary = this.numberOfHours * this.payPrHour;
        return salary;
    }

    @Override
    public String toString(){
        String salary = String.format("%.2f,-", calculateSalary()); // Display salary with two decimals
        return super.name + ": " + salary;
    }
}
