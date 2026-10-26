import java.util.*;
class SumArray{
    public static void main(String[] args) {
        int sum=0;
        int arr[]={15,20,25,30,45};
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
         System.out.println(sum);
    }
}