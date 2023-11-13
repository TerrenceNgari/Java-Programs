// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

//Java Program to Generate nested loop patterns
public class Pattern2 {

    public static void main(String[] args){
        int i, j;
        for(i= 1; i<= 5; i++)
        {
        
            for (j= 1; j<= 1; j++)
            {
                System.out.print(" 8 " + "  " );

                for (j= 1; j<= 1; j++)
                {
                    System.out.print(" 3 " + "  " );

                    for (j= 1; j<= 1; j++)
                    {
                        System.out.print(" 9 " + "  " );
                        
                        for (j= 1; j<= 1; j++)
                        {
                            System.out.print(" 16 " + "  " );
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}