public class CommissionEmployee  extends Employee{

    // Attributes
    private double baseSalary;
    private double salesAmount;
    private double commissionPercentage;

    // Constructor
    CommissionEmployee(String name, double baseSalary, double salesAmount, double commissionPercentage){
        super.name = name;
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }

    // Methods
    @Override
    public double calculateSalary(){
        double commission = this.salesAmount * this.commissionPercentage;
        double salary = this.baseSalary + commission;
        return salary;
    }

    @Override
    public String toString(){
        String salary = String.format("%.2f,-", calculateSalary()); // Display salary with two decimals
        return super.name + ": " + salary;
    }
}
