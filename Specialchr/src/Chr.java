// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import java.util.Scanner;
 

//Java Program to find Specialchr
 
public class Chr {
 
    public static void main(String[] args) {
        // char chr;
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Take input from user
        System.out.println("Input the special character");
        char chr = scanner.next().charAt(0);
        
 
        
        //Switch case for name of the special character
        
        
        switch (chr) {
        case '$':
            System.out.println("Dollar sign");
            break;
        case '&':
            System.out.println("Ampersand");
            break;
        case '*':
            System.out.println("Asterisk");
            break;
        case '@':
            System.out.println("Asperand");
            break;
        case '#':
            System.out.println("hash");
            break;
        case '%':
            System.out.println("percent");
            break;
        case '~':
            System.out.println("Tilde");
            break;
        default:
            System.out.println("Invalid Input");
        } 
    }
}
