class Vowels{
    public static void main(String[]args){
       String s="Hello world";
        int vowels=0;
        int cons=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            } else{
                cons++;
            }
            }
            System.out.println("Vowels:" +vowels);
            System.out.println("consonents:" +cons);
    }
}