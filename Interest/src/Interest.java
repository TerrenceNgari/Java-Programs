// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
 

//Java Program to find Compound Interest

public class Interest {
 
    public static void main(String[] args) {
        double p = 1000, r = 5, n, a ;       
        
        //Compound Interest = a = p (1 +r)n 
         
        for(n = 1; n < 11; n++){

            a = p * (Math.pow((1 + r/100), (n)));
                       
            System.out.format("Amount at the end of year%.0f = %.2f\n",n ,a);

            p = a;
        
        }
        
    }
}
