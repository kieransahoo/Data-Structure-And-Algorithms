package Recursion;

public class StackXPowerN {
    public static  int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

//        int xP1 = calcPower(x,n-1);
//        int xP = x*xP1;
//        return xP;
        return x*calcPower(x,n-1);
    }

    public static void main(String[] args){
        int x = 2;
        int n = 5;
        System.out.println(calcPower(2,5));
    }
}
