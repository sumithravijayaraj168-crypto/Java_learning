import java.util.*;
class SecondMin{
    public static void main(String[] args) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int arr[]={7,8,-15,17,91,98};
        for(int i=0;i<arr.length;i++){
            if(min1>arr[i]){
                min2=min1;
                min1=arr[i];
            }else if(min2>arr[i]){
                min2=arr[i];
            }
        }
        System.out.println(min2);
    }
}