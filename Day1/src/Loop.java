import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String grade;
        String feedback;

        switch (marks / 10) {
            case 10:
            case 9:
                grade = "A1";
                feedback = "Excellent";
                break;
            case 8:
                grade = "A";
                feedback = "VeryGood";
                break;
            case 7:
                grade = "B";
                feedback = "Good";
                break;
            case 6:
                grade = "C";
                feedback = "Avg";
                break;
            default:
                grade = "f";
                feedback = "Fail";

        }
        System.out.println("grade:" + grade);
        System.out.println("feedback:" + feedback);
        sc.close();
    }

}
