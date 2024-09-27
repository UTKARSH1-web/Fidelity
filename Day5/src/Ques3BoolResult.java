import java.util.Scanner;

public class Ques3BoolResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.print("Enter X: ");
        x = sc.nextInt();

        System.out.print("Enter Y: ");
        y = sc.nextInt();

        boolean result = (x<y);

        System.out.println("The result of whether x is less than y is " + result);

        sc.close();
    }
}
