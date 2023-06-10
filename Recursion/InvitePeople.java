package Recursion;

// Find the number of ways in which you can invite n people to your party,
// single or in pairs

public class InvitePeople {

    public static int callGuest(int n){
        if(n<=1){
            return 1;
        }

        int ways1 = callGuest(n-1);

        int ways2 = (n-1) * callGuest(n-2);

        return ways1+ways2;
    }

    public static void main(String[] args){
        int n = 4; // {1,2,3,4}
        // 1 2 3 4
        // 1 23 4
        // 1 2 34
        // 1 24 3 .. simiarly with 2 , 3 ,4 total 10 ways
        //12 34
        //13 24
        // 14 23
        //...........

        System.out.println(callGuest(n));

    }
}
