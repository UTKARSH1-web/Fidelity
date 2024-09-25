public class TemporaryEmployee extends Employee{
    private int dailyWages;
    private int noOfDays;

    public TemporaryEmployee(int id, String name, int dailyWages, int noOfDays) {
        super(id, name, dailyWages*noOfDays);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
        this.setNetSalary(calculateNetSalary());
        this.setBonus(calculateBonus());
    }
    public int getDailyWages() {
        return dailyWages;
    }
    public int getNoOfDays() {
        return noOfDays;
    }
    private float calculateBonus() {
        float netSalary = getNetSalary();
        if(dailyWages <1000){
            return 0.15f * netSalary;
        }
        else if(dailyWages >= 1000 && dailyWages < 1500){
            return 0.12f * netSalary;
        }
        else if(dailyWages >= 1500 && dailyWages < 1750){
            return 0.11f * netSalary;
        }
        else{
            return 0.08f * netSalary;
        }
    }
    @Override
    protected float calculateNetSalary() {
        return dailyWages * noOfDays;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDaily Wages: " + dailyWages + "\nNo Of Days: " + noOfDays;
    }
}
