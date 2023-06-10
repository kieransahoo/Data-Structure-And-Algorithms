//package BackTracking;
//
//import java.util.ArrayList;
//import java.util.List;
//
////Print all solutions where queens are safe
//public class NQueens {
//    public static List<List<String>> solveNQueens(int n){
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new char[n][n];
//        helper(board,allBoards,0);
//    }
//
//    private static void helper(char[][] board, List<List<String>> allBoards, int col) {
//        if(col == board.length){
//            saveBoard(board,allBoards);
//            return;
//        }
//
//        for(int row=0;row<board.length ;row++)
//        {
//            if(isSafe(row,col,board)){
//                board[row][col] = 'Q';
//                helper(board, allBoards, col+1);
//                board[row][col]='.';
//            }
//        }
//    }
//
//    private static void saveBoard(char[][] board, List<List<String>> allBoards) {
//    }
//
//    private static boolean isSafe(int row, int col, char[][] board) {
//        //
//    }
//
//
//    public static void main(String[] args){
//
//    }
//}
