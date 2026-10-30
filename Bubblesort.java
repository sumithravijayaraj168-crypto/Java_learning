import java.util.*;
class BubbleSort{
    public static void main(String[] args) {
        int arr[]={6,8,2,4,9};
        for(int i=1;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
            System.out.println("sorted array");
            System.out.println(Arrays.toString(arr));
    }
}