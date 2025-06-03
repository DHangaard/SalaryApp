public class MonthlyEmployee extends Employee{

    // ---------- Attributes ----------
    private double salary;


    // ---------- Constructor ----------
    MonthlyEmployee(String name, double salary){
        super.status = "Paid monthly";
        super.name = name;
        this.salary = salary;
    }


    // ---------- Methods ----------
    @Override
    public double calculateSalary(){
        return salary;
    }


    @Override
    public String toString(){
        String message = buildPaycheckDetails();
        return message;
    }


    @Override
    protected String buildPaycheckDetails(){
        String salary = String.format("%.2f,-", calculateSalary()); // Display salary with two decimals

        String message = this.name + "'s paycheck:" +
                        "\nStatus: " + super.status +
                        "\nSalary: " + salary;

        return message;
    }
}
