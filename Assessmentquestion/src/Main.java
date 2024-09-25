
public class Main {
    public static void main(String[] args) {
        ParmanentEmployee emp = new ParmanentEmployee(101, "Ester", 25000, 4000, 1500);
        System.out.println(emp);

        System.out.println();

        TemporaryEmployee temp = new TemporaryEmployee(101, "Ganesh", 1500, 20);
        System.out.println(temp);

    }
}