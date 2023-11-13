// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

public class Employee {
    private String name;
    private String Empnum;
    private int age;

    public Employee () {
        name = "James Magane";
        Empnum = "TK455643";
        age = 34;
    }

    public Employee (String nm, String num) {
        name = nm;
        Empnum = num;
        
    }

    public Employee (String nm, String num, int a) {
        name = nm;
        Empnum = num;
        age = a;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return Empnum;
    }

    public int getAge() {
        return age;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setNum(String num) {
        Empnum = num;
    }

    public void setAge(int a) {
        age = a;
    }

    public String toString() {  
        return String.format("Employee Name: %s \n EmployeeNumber: %s \n Age: %d ", getNum() , getAge() , getName()) ;
    }  

    public class Driver {
        public static void main (String args[]) {
            Employee emp = new Employee();
            System.out.println(emp.toString());
        }
    }

}