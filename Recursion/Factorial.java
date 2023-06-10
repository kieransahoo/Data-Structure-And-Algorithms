package Recursion;

public class Factorial {
    public static int printFactorial(int n){
        if(n==1 || n== 0){
            return 1;
        }
        return n*printFactorial(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        //Factorial - Iterative Method
        int fact = 1;
        for(int i = 1; i<=n ; i++) // similarly you can take from n to 0 as well
        {
            fact = fact*i;
        }
        System.out.println("Iterative Factorial : " + fact);

        System.out.println("Recursive Factorial : "+printFactorial(n));
    }
}
