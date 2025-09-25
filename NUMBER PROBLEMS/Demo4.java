import java.util.Scanner;

public class Demo4 {

    public static void palindrome(int num) {
        int rev = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (rev == original) {
            System.out.println(original + " is palindrome");
        } else {
            System.out.println(original + " is not palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();

        palindrome(number);
        scan.close();
    }
}
