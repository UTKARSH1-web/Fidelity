//Implement a user defined function to handle age eligibility to vote

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (ageEligiblity(age)){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("You are not Eligible to vote");
        }
    }
    public static boolean ageEligiblity(int age){
        return age >= 18;
    }
}
