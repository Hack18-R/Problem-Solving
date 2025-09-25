import java.util.Scanner;

public class Demo {

    // Method to find even or odd number
    public static boolean evenOrOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        // Stores final result
        boolean result;

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the number");
        int number = scan.nextInt();

        // Calling and storing boolean value in a variable
        result = evenOrOdd(number);

        // checking even or odd
        if (result == true) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // clsoing scan object
        scan.close();
    }
}