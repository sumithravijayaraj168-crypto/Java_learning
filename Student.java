import java.util.*;
class Student {
    String name;
    String department;
    int mark;
    public static void main(String[]args){
    Scanner s1=new Scanner(System.in);
        System.out.print("name:");
        String name=s1.nextLine();
        System.out.print("department:");
        String department=s1.nextLine();
        System.out.print("mark:");
        int mark=s1.nextInt();
        System.out.println("name:"+name);
        System.out.println("department:"+department);
        System.out.print("mark:"+mark);
    }
}
