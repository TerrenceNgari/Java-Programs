// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

public class Customer {
    private int id;
    private String name;
    private int discount;
    
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getDiscount() {
        return discount;
    }
    
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    public String toString() {
        return String.format(" %d %s %d ", getId() , getName() , getDiscount()) ;
    }
}



public class TestCustomer {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Smith", 10);
        System.out.println(c1);
        c1.setDiscount(20);
        System.out.println(c1);;
    }
}

public class Invoice{
    private int id;
    Customer c2 = new Customer()
    private double amount;
    
    public Invoice(int id, c2 Customer, double amount) {
        this.id = id;
        // this.c
        this.discount = amount;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCustomer() {
        return c2;
    }

    // public void setCustomer(customer : Customer) {
    //     this.amount = amount;
    // }

    
    public String getamount() {
        return amount;
    }
    
    public void setamount(double amount) {
        this.amount = amount;
    }

    public getCustomerName(string c2) {
            // this.amount = amount;
    }

    public double getAmountAfterDiscount() {
        return amount;
    }
    
    // public String toString() {
    //     return String.format(" %d %s %d ", getId() , getName() , getamount()) ;
    // }
}
