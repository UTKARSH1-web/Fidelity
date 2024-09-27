import java.util.Scanner;

public class Ques1RegistrationForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your Country: ");
        String country = sc2.next();
        System.out.print("Welcome "+ name +". your age is " + age + " and you are from " + country);
        sc.close();
    }
}
