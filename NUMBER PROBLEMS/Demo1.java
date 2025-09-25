
import java.util.Scanner;

public class Demo1 {
    //Method to find count of even and odd in digits 
    public static void countEvenAndOdd(int digits) {
        //Initializtion of default values for even and odd counts
        int evenCount = 0;
        int oddCount = 0;

        //Loops 
        while (digits > 0) {
            //Extracting single number
            int numbers = digits % 10;
            
            //Checking even or odd 
            if (numbers % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            //Removing digits one by one
            digits = digits / 10;
        }

        //Printing even and odd count values
        System.out.println("Even number: " + evenCount);
        System.out.println("Odd number: " + oddCount);
    }

    public static void main(String[] args) {

        //Scanner object
        Scanner scan = new Scanner(System.in);
        
        //Taking user input
        System.out.println("Enter the Digits");
        int num = scan.nextInt();

        //calling method
        countEvenAndOdd(num);

        //closing scan object
        scan.close();
    }
}
