import java.util.Scanner;

public class Demo12 {
    public static void armstrong(int num) {

        // Storing original value inside new variable
        int original = num;

        int sum = 0;
        int n = 0;
        int temp = num;

        while (temp > 0) {
            temp = temp / 10;
            n++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is Not an Armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        armstrong(number);
        scan.close();
    }
}
