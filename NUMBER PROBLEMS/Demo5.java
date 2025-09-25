import java.util.Scanner;

public class Demo5 {

    public static void plindromeRange(int start, int end) {

        for (int i = start; i <= end; i++) {
            int num = i;
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (rev == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the start number");
        int startNumber = scan.nextInt();
        System.out.println("Enter the end number");
        int endNumber = scan.nextInt();

        plindromeRange(startNumber, endNumber);
        scan.close();
    }
}
