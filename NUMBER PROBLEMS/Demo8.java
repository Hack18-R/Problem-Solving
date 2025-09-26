import java.util.Scanner;

public class Demo8 {
    public static void fibonacci(int num) {
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        fibonacci(number);
        scan.close();
    }
}
