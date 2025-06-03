public class HourlyEmployee extends Employee{

    // ---------- Attributes ----------
    private double numberOfHours;
    private double payPrHour;


    // ---------- Constructor ----------
    HourlyEmployee(String name, double numberOfHours, double payPrHour){
        super.status = "Paid by the hour";
        super.name = name;
        this.numberOfHours = numberOfHours;
        this.payPrHour = payPrHour;
    }


    // ---------- Methods ----------
    @Override
    public double calculateSalary(){
        double salary = this.numberOfHours * this.payPrHour;
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
        String formattedPayPrHour = String.format("%.2f,-", this.payPrHour);

        String message = this.name + "'s paycheck:" +
                "\nStatus: " + super.status +
                "\nHourly wage: " + formattedPayPrHour +
                "\nClocked hours: " + this.numberOfHours +
                "\nSalary: " + salary;

        return message;
    }
}
