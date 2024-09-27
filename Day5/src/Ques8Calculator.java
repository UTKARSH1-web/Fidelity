import java.util.Scanner;

public class Ques8Calculator {
    public int Add(int a, int b){
        return a+b;
    }
    public int Sub(int a, int b){
        return a-b;
    }
    public int Mul(int a, int b){
        return a*b;
    }
    public double[] Div(int a, int b){
        double[] res = new double[2];
        if(b!=0){
            res[0] = a/b;
            res[1] = a%b;
        }
        else{
            System.out.println("Division by zero not allowed");
            res[0] = Double.NaN;
            res[1] = Double.NaN;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ques8Calculator calc = new Ques8Calculator();
        System.out.println("Enter the ope ( + , - , * , / ): ");
        char op = sc.next().charAt(0);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        switch(op){
            case '+':
                System.out.println("Resut of " + a + " + " + b + " is " + calc.Add(a, b));
                break;
            case '-':
                System.out.println("Result of " + a + " - " + b + " is " + calc.Sub(a, b));
                break;
                case '*':
                    System.out.println("Result of " + a + " * " + b + " is " + calc.Mul(a, b));
                    break;
                    case '/':
                        double[] res = calc.Div(a, b);
                        if(!Double.isNaN(res[0])){
                            System.out.println("Result of " + a + " / " + b + " is " + calc.Div(a, b));
                            System.out.println("Remainder = " + (int)res[1]);
                        }
                        break;
                        default:
                            System.out.println("Invalid ope");
        }
        sc.close();
    }
}
