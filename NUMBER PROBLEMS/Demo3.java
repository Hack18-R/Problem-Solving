
import java.util.Scanner;

public class Demo3 {

    public class App {

        public static void primeRange(int startValue, int endValue) {

            for (int i = startValue; i <= endValue; i++) {
                if (i < 2) {
                    continue;
                }

                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the start");
            int start = scan.nextInt();
            System.out.println("Enter the end");
            int end = scan.nextInt();

            primeRange(start, end);
            scan.close();
        }
    }
}
