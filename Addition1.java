class Addition1 {
    public static void main(String[]args){
          String s1="456";
          String s2="123";
          int a=0;
          int b=0;
        for(char c:s1.toCharArray()){
            a=a*10;
            a=a+c-'0';
        }
        for(char n:s2.toCharArray()){
            b=b*10;
            b=b+n-'0';
        }
        System.out.println(b+a);
        
    }
}