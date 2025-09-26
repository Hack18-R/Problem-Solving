import java.util.Scanner;

public class Demo11 {
    public static void revNumberEquals(int num) {
        int rev = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (rev == original) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equals");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        revNumberEquals(number);
        scan.close();

    }
}
