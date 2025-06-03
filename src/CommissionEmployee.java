public class CommissionEmployee  extends Employee{

    // ---------- Attributes ----------
    private double baseSalary;
    private double salesAmount;
    private double commissionPercentage;


    // ---------- Constructor ----------
    CommissionEmployee(String name, double baseSalary, double salesAmount, double commissionPercentage){
        super.status = "Paid by commission";
        super.name = name;
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionPercentage = commissionPercentage;
    }


    // ---------- Methods ----------
    @Override
    public double calculateSalary(){
        return this.baseSalary + calculateCommission();
    }


    @Override
    public String toString(){
        String message = buildPaycheckDetails();
        return message;
    }


    private double calculateCommission(){
        return this.salesAmount * this.commissionPercentage;
    }


    private int formatCommissionPercentage(){
        double percentage = this.commissionPercentage * 100;
        int formattedPercentage = (int) percentage;
        return formattedPercentage;
    }


    @Override
    protected String buildPaycheckDetails(){
        String salary = String.format("%.2f,-", calculateSalary()); // Display salary with two decimals
        String formattedBaseSalary = String.format("%.2f,-", this.baseSalary);
        String formattedSalesAmount = String.format("%.2f,-", this.salesAmount);
        String formattedCommissionPercentage = formatCommissionPercentage() + "%";

        String message = this.name + "'s paycheck:" +
                "\nStatus: " + super.status +
                "\nBase salary: " + formattedBaseSalary +
                "\nSales amount: " + formattedSalesAmount +
                "\nCommission percentage: " + formattedCommissionPercentage +
                "\nSalary: " + salary;

        return message;
    }
}
