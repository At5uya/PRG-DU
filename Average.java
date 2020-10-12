import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = in.nextInt();

        System.out.print("Input second number: ");
        double num2 = in.nextInt();

        System.out.print("Input third number: ");
        double num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        double num4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        double num5 = in.nextInt();


        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
    }
}