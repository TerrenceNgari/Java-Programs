// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.util.Scanner;
public class Time{
    int hours;
    int minutes;
    int seconds;
    Time(){
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    Time(int h,int m,int s){
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setHours(int h) {
        hours = h;
    }

    public void setMinutes(int m) {
        minutes = m;
    }

    public void setSeconds(int s) {
        seconds = s;
    }

    public String toString() {  
        return String.format("Time is  %d %d %d ", getHours() , getMinutes() , getSeconds()) ;
    } 

    public Time incurTime(Time t){
        int execution = (this.minutes + t.minutes)/60;
        int hr = (hours + t.hours + execution)%24;
        int mn = (this.minutes + t.minutes)%60;

        return new Time(hr ,mn, mn);

    }

    public class TestTime {
        public static void main (String args[]) {
            Time t = new Time();
            System.out.println(t.toString());

            Scanner input = new Scanner(System.in);
            System.out.print("Enter hour: ");
            int hours = input.nextInt();
            System.out.print("Enter minute: ");
            int minutes = input.nextInt();
            System.out.print("Enter second: ");
            int seconds = input.nextInt();
            Time time = new Time(hours, minutes, seconds);
            System.out.println(time);
            time.add(12, 30, 30);
            System.out.println(time);

        }
    }

    public void add(int i, int j, int k) {
    }


}