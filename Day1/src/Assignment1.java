
//Find the sum of even number in an integer array

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
        int [] array = new int[50];
        for(int i=0;i< array.length;i++){
            array[i] = i+1;
        }
        int sum = sumOfNumbers(array);
        System.out.println("The sum of the numbers is: " + sum);
    }

    public static int sumOfNumbers(int[] array){
        int sum = 0;
        for(int num : array){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
