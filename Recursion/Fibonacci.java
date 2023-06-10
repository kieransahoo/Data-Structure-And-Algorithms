package Recursion;

public class Fibonacci {
    public static void printFib(int a, int b , int i){
       if(i==0)return;

        int c = a+b;
        System.out.print(" "+c);
        printFib(b,c,i-1);
    }

    public static void main(String[] args){
        //fibonaaci => 0,1,1,2,3,5,8.....
        int n = 7;
        int a = 0;
        int b = 1;
//        int c=0;
        System.out.println("<-- Recursion Fibonacci -->");
        System.out.print(a+" "+b);
//        for(int i = 2 ; i<=10 ;i++)
//        {
//            c = a+b;
//            System.out.print(" "+c);
//            a=b;
//            b=c;
//        }

        printFib(a,b,n-2);

    }
}
