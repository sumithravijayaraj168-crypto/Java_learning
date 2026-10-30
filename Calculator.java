import java.util.*;
class Calculator {
        int Addition (int a,int b){
            return a+b;
        }
        int Subtraction (int a,int b){
            return a-b;
        }
        int multiply (int a,int b){
            return a*b;
        }
        int division (int a,int b){
            return a/b;
        }
    public static void main(String[] args){
        Calculator s1=new Calculator();
        int Add=s1.Addition(5,7);
        int sub=s1.Subtraction(5,3);
        int mul=s1.multiply(4,5);
        int div=s1.division(10,2);
        System.out.println("addition:"+Add);
        System.out.println("subtraction:"+sub);
        System.out.println("division:"+div);
        System.out.println("multiplication:"+mul);
    
        }
}