import java.util.Scanner;

public class Demo6 {
    public static int fact(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int result = fact(num);
        System.out.println(num + " Factorial is: " + result);
        scan.close();
    }
}
