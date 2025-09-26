import java.util.Scanner;

public class Demo7 {
    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scan.nextInt();

        int result = fact(number);
        System.out.println(number + " Factorial is: " + result);
        scan.close();
    }
}
