package Recursion;

public class TowerOfHanoi {
//    public static int count = 0;
    public static void towerOfHanoi(int n , String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);


        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,helper,src,dest);



    }
    public static void main(String[] args){
        int n = 2;
        int count = 0;
        towerOfHanoi(n,"S","H","D");
        // O(2^n -1) || O(2^n)
//        System.out.println(count);
    }
}
