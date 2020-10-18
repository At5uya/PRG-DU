import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Please enter the number of numbers that you want.");
        Scanner skunk = new Scanner(System.in);
        int numbers = skunk.nextInt();
        double[] pole = new double[numbers];
        double total = 0;


        for (int i = 0; i < pole.length; i++) {
            System.out.println("Enter a number " + (i + 1) + ":");
            pole[i] = (int) skunk.nextDouble();

        }
        for (int i = 0; i < pole.length; i++) {
            total = total + pole[i];
        }
        double average = total / pole.length;

        System.out.println("The average is: " + average);
    }
}
