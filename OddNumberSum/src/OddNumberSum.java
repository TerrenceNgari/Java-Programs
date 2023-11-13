// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
 
import java.util.*;
 
//Java Program to Generate sum of odd numbers
public class OddNumberSum {
    public static void main(String args[]) {
        int x = 100, y, sum = 0; 
        
        for(y = 20; y <= x; y++){
            if((y%2) == 1){
                sum += y;
            }
        }
     
        System.out.format("Sum of all odd numbers between 20 to 100 is %d" ,sum);
    }
}