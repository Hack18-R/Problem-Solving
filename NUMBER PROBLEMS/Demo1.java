
import java.util.Scanner;

public class Demo1 {

    public static void countEvenAndOdd(int digits) {
        int evenCount = 0;
        int oddCount = 0;
        while (digits > 0) {
            int numbers = digits % 10;

            if (numbers % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            digits = digits / 10;
        }

        System.out.println("Even number: " + evenCount);
        System.out.println("Odd number: " + oddCount);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Digits");
        int num = scan.nextInt();

        countEvenAndOdd(num);
        scan.close();

    }
}