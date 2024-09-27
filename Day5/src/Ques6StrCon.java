import java.util.Scanner;

public class Ques6StrCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String First = sc.nextLine();
        System.out.print("Enter the last name: ");
        String Last = sc.nextLine();
        String FullName = First.concat(Last);
        System.out.print("Full Name: " + FullName );
    }
}
