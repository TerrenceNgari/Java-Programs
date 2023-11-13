// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }


//Java Program to Generate single loop patterns
public class Pattern1 {

    public static void main(String[] args) {

        // Multiplication Pattern
        int num = 9;
        for(int i = 1; i <= 7; ++i)
        {
            System.out.printf("%d,",num * i);
        }
        System.out.println("\n");

        // Increment of two pattern
        int n = 10;
        for(int x = 1; x <= 8; ++x)
        {
            System.out.printf("%d,",n );
            n = n + 2;

        }

    }
}