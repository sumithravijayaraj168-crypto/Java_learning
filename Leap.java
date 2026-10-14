import java.util.*;
public class Leap{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the year:");
        int year=scan.nextInt();
        if(year%400==0){
            System.out.println(year+"is leap year");
        }else if(year%4==0 && year%100!=0){
            System.out.println(year+"is leap year");
        }else{
            System.out.println(year+"not leap year");
        }
        
    }
}