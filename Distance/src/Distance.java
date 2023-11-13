// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import java.util.Scanner;
 

//Java Program to find Distance
public class Distance {
 
    public static void main(String[] args) {
        double d, x1, x2, y1, y2;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Take input from user
        System.out.println("Input the x coordinate of point 1: ");
        x1 = scanner.nextDouble();
        System.out.println("Input the y coordinate of point 1: ");
        y1 = scanner.nextDouble();
        System.out.println("Input the x coordinate of point 2: ");
        x2 = scanner.nextDouble();
        System.out.println("Input the y coordinate of point 2: ");
        y2 = scanner.nextDouble();
 
        
        //Total Distance = √[(x2 − x1)2 + (y2 − y1)2] 
        
        d = Math. sqrt((x2 - x1)*2 + (y2 - y1)*2) ;

 
        
 
        System.out.format("Distance between p1 (%.0f,%.0f) and p2(%.0f,%.0f)=%.2f units",x1 ,y1 ,x2 ,y2 , d);
    }
}
