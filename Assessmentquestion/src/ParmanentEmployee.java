public class ParmanentEmployee extends Employee {
    private int pf;

    public ParmanentEmployee(int id, String name, float basicSalary, float bonus, int pf) {
        super(id, name, basicSalary);
        this.pf = pf;
        this.setBonus(calculateBonus());
        this.setNetSalary(calculateNetSalary());
    }

    public int getPf() {
        return pf;
    }
    private float calculateBonus() {
        float basicSalary = getBasicSalary();
        if(pf < 1000){
            return basicSalary * 0.10f;
        }
        else if(pf >= 1000 && pf < 1500) {
            return basicSalary * 0.115f;
        }
        else if(pf >= 1500 && pf < 1800) {
            return basicSalary * 0.12f;
        }
        else {
            return basicSalary * 0.15f;
        }
    }

    @Override
    protected float calculateNetSalary() {
        return getBasicSalary() - pf;

    }

    @Override
    public String toString() {
        return super.toString() + "\nPF: " + pf;
    }
}