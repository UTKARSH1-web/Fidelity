import java.util.Scanner;

public class Ques2sqandcube {
    static double findSq(double num){
        return num*num;
    }
    static double findCube(double num){
        return num*num*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num = sc.nextDouble();

        double Square = findSq(num);
        double Cube = findCube(num);

        System.out.println("The square is: " + Square);
        System.out.println("The cube is: " + Cube);
        sc.close();
    }
}
