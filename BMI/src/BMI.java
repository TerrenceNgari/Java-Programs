// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import java.util.Scanner;
 
// Java Program to find BMI
public class BMI {
 
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter User Weight in Kilograms");
        weight = scanner.nextDouble();
 
        System.out.println("Enter User Height in Meters");
        height = scanner.nextDouble();
 
        
        // Total BMI = weightInKilograms/heightInMeters*heightInMeters 
        
        bmi = weight / (height * height);
 
        
 
        System.out.format("BMI = %.2f\n", bmi);
        System.out.printf("BMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater");
    }
}