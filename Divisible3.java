import java.util.*;
public class Divisible3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0){
                sum=sum+i;
            }
        }
             System.out.println("divisible by 3:"+sum);
    }
}