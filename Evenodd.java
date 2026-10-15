import java.util.*;
public class Evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int odd=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            sum=sum+i;
            }else{
                odd=odd+i;
            }
        }
            System.out.println("sum of odd:"+odd);
            System.out.println("sum of even:"+sum);
     }    
 }
