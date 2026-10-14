import java.util.*;
 public class Greaterno{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the 1st no:");
        int a=scan.nextInt();
        System.out.println("Enter the 2nd no:");
        int b=scan.nextInt();
        System.out.println("enter the 3rd no:");
        int c=scan.nextInt();
        if(a>b&&a>c){
            System.out.println("greater number is:"+a);
        }else if(b>a&&b>c){
              System.out.println("greater number is:"+b);
        }else{
              System.out.println("greater number is:"+c);
        }
    }
}