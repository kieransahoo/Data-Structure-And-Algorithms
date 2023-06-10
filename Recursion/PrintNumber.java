package Recursion;

public class PrintNumber {

    public static void recPrint(int n){
        if(n==0)return;
        System.out.print(n+" ");
        recPrint(n-1);
    }

    public static void print1toN(int n,int i){
        if(i>n){
            return;
        }
        System.out.println(i+" ");
        print1toN(n,i+1);
    }

    public static void main(String[] args){
        int n = 5;
        // Print Number from N to 1

        //Using Iterative Method
        for(int i = n ; i>0 ;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        //Using Recursion Method
        System.out.println("##Using Recursion Method");
        recPrint(n);
        print1toN(n,0);
    }

}
