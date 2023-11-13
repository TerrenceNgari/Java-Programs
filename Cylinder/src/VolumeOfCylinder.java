// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
 
import java.util.Scanner;
 

//Java Program to find volume and surface area of Cylinder
 
public class VolumeOfCylinder {
 
    public static void main(String[] args) {
        double radius, height, volume, surfaceArea;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take input from user
        System.out.println("Enter Base Radius of Cylinder");
        radius = scanner.nextDouble();
 
        System.out.println("Enter Height of Cylinder");
        height = scanner.nextDouble();
 
        
        //Total surface area of Cylinder = 2 X PI X Radius X (Radius + Height)
        
        surfaceArea = 2 * Math.PI * radius * (radius + height);
 
        /* Volume of Cylinder = PI X Radius X Radius X Height */
        volume = Math.PI * radius * radius * height;
 
        System.out.format("Surface Area of Cylinder = %.3f\n", surfaceArea);
        System.out.format("Volume of Cylinder = %.3f\n", volume);
    }
}