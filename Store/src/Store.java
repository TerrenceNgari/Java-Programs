// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.util.Scanner;
 

//Java Program to manage store sales

public class Store {
 
    public static void main(String[] args) {
        double p, q, total, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        int n = 1;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Take input from user        
        do{
 
        System.out.format("Enter Quantity sold fo product %d\n",n );
        q = scanner.nextInt();
 
        
        //Retail Price of Product        
        switch (n) {
            case 1:
            p = 254.50;
            total1 = p * q;
                
                break;
            case 2:
            p = 356.50;
            total2 = p * q;
                
                break;
            case 3:
            p = 950;
            total3 = p * q;
                
                break;
            case 4:
            p = 480;
            total4 = p * q;
                
                break;
            case 5:
            p = 680;
            total5 = p * q;
                
                break;
            default:
                System.out.println("Invalid Input");
          }

          n++;
 
        }while(n <= 5);
          /* Total retail value of sold products */
        total = total1 + total2 + total3 + total4 + total5;

        
 
        System.out.format("Total retail value of sold products= %.2f\n", total);
        
    }
}