import java.util.*;
class Anagram {
    public static void main(String[] args) {
        String s="listen";
        String t="silent";
        boolean check = false;
        char arr[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        for(int c:arr)
        Arrays.sort(arr);
        Arrays.sort(arr2);
        String s1=new String(arr);
        String s2=new String(arr2);
        if(s1.equals(s2)){
            check = true;
            System.out.println(check);
        } 
    }
}