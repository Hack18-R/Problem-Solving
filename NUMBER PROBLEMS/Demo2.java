import java.util.Scanner;

public class Demo2 {

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        boolean primeResult = prime(number);
        if (primeResult == true) {
            System.out.print(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
        scan.close();
    }
}
