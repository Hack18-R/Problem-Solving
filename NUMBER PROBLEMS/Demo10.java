import java.util.Scanner;

public class Demo10 {
    public static int revNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        int revNum = revNumber(number);
        System.out.println("Reversed number is: " + revNum);
        scan.close();

    }
}
