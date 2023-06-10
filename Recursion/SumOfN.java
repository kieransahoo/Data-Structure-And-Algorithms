package Recursion;

public class SumOfN {

    public static void recSum(int i,int n,int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        recSum(i+1,n,sum);
    }
    public static void main(String[] args){
        int n = 5;
        // By Using Formula
        int sum = n*(n+1)/2;
        System.out.println("Formula : "+sum);

        // By Using Iterative method
        int sum1 = 0;
        for(int i = 0; i<=n ;i++)
        {
            sum1 += i;
        }
        System.out.println("Iterative : "+sum1);

        System.out.println("<-- Recursion Sum -->");
        recSum(0,n,0);

    }

}
