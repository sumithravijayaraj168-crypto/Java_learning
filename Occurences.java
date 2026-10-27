class Occurences{
    public static void main(String[] args) {
        int arr[]={10,20,10,40,20,20,10};
        int count=0;
        int target=10;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                count+=1;
            }
        }
        System.out.println(count);
    }
}