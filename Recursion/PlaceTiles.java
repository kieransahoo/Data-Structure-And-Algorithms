package Recursion;

// Place Tiles of size 1xm in a floor of size nxm;
public class PlaceTiles {

    public static int placeTiles(int n , int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int verticlePlacement = placeTiles(n-m,m);

        //horizontal
        int horizontalPlacement = placeTiles(n-1,m);

        return verticlePlacement+horizontalPlacement;
    }

    public static void main(String[] args){
        int n = 4, m = 2;
        int count = placeTiles(n,m);
        System.out.println(count);

    }
}
