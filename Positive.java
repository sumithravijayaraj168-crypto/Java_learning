import java.util.*;
public class Positive{
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number");
        int a=scan.nextInt();
        if(a>=0){
            System.out.println(a+"is a positive number");
        }else{
            System.out.println(a+"is a negative number");
        }
    }
}