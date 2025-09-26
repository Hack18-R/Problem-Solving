import java.util.Scanner;

public class Demo9 {

    public static void fibonacci(int num) {
        int first = 0;
        int second = 1;

        int next = 0;
        for (int i = 3; i <= num; i++) {
            next = first + second;

            first = second;
            second = next;
        }
        System.out.println(next);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        fibonacci(number);
        scan.close();
    }
}
