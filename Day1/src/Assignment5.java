//Passing array as an argument.....

public class Assignment5 {
    public static double calculateAvg(double[] numbers){
        if(numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array is null or empty");
        }
        double sum = 0;
        for(double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        double [] arr = {10, 20, 30, 40, 50};
        double avg = calculateAvg(arr);
        System.out.println("The average of the array is: " + avg);
    }
}
