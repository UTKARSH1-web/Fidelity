import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 class Ques2_ExceptionHandling {
     static class EmpNotFoundException extends Exception {
    public EmpNotFoundException (String message) {
        super(message);
    }
}
    static class Emp{
        private int id;
        String name;

        public Emp(int id, String name){
            this.id = id;
            this.name = name;
        }
        public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
    }
    static class EmpManager {
        private List<Emp> employees;

        public EmpManager() {
            employees = new ArrayList<>();
            employees.add(new Emp(1, "Utkarsh"));
            employees.add(new Emp(2, "Rajesh"));
        }

        public void checkEmpPresent(int id) throws EmpNotFoundException {
            for (Emp employee : employees) {
                if (employee.getId() == id) {
                    System.out.println("Employee found: " + employee.getName());
                    return;
                }
            }
            throw new EmpNotFoundException("Employee with Id " + id + " not found");
        }
    }
    public static void main(String[] args) {
            EmpManager manager = new EmpManager();

            try {
                manager.checkEmpPresent(1);
                manager.checkEmpPresent(3);
            }
            catch (EmpNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

