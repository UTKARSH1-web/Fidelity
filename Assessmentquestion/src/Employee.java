public class Employee{
    private int id;
    private String name;
    private float basicSalary;
    private float bonus;
    private float netSalary;

    public Employee(int id, String name, float basicSalary){
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
//        this.bonus = bonus;
//        this.netSalary = calculateNetSalary();
    }
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus){
        this.bonus = bonus;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getBasicSalary(){
        return basicSalary;
    }

    public float getNetSalary(){
        return netSalary;
    }
    public void setNetSalary(float netSalary){
        this.netSalary = netSalary;
    }

    protected float calculateNetSalary(){
        return basicSalary + bonus;
    }

    @Override
    public String toString(){
        return "Employee ID: " + id + "\n Employee Name: " + name + "\nBasicSalary: " + basicSalary + "\nBonus: " + bonus + "\nNetSalary: " + netSalary;
    }

}
