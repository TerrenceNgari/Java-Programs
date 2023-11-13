// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import java.util.Scanner;

//Java Program that generates Hailstone Sequences
public class Hailstone {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Take input from user
        System.out.printf("Enter a number:  ");
        try {
            int n = inputScanner.nextInt();
            
            while (n != 1 && n > 0) {
                if (n % 2 == 0) {
                    System.out.print(n + ",");
                    n /= 2;
                } else {
                    System.out.print(n + ",");
                    n = n * 3 + 1;
                }
                
            }

            System.out.format("%d",n) ;
        } 

        catch (Exception e) {
                System.out.println("Not a nummber!! Run your Program again");
        }
    }
}