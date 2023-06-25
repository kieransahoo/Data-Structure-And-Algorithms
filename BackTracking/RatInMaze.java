package BackTracking;

import java.util.Scanner;

public class RatInMaze {
    static boolean flag = false;
    public static void ratInAMaze(int[][] arr, int row , int col, String ans){
        if(row<0 || row>=arr.length || col < 0 || col>=arr.length || arr[row][col] == 0){
            return;
        }
        if(row == arr.length -1 && col == arr.length-1){
        System.out.print(ans+" ");
        flag = true;
        return;
        }
    
        arr[row][col] = 0;
        ratInAMaze(arr,row+1,col,ans+"D");
        ratInAMaze(arr,row,col-1,ans+"L");
        ratInAMaze(arr,row,col+1,ans+"R");
        ratInAMaze(arr,row-1,col,ans+"U");
        arr[row][col] = 1;
         
            
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // int[][] arr = new int[n][n];
        
        // for(int i = 0; i<n ;i++)
        // {
        //     for(int j = 0; j<n ;j++)
        //     {
        //        arr[i][j] = sc.nextInt();
        //     }
        // }
        int n = 4;
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        
        String ans = "";
        ratInAMaze(arr,0 ,0,ans);
        
        if(flag == false){
            System.out.println(-1);
        }
           
    }
}
