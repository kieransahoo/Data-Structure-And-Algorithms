package Recursion;

public class FirstLastOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str,int idx, char element){
        if(idx == str.length()){
            System.out.print(first+" ");
            System.out.print(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str,idx+1,element);
    }
    public static void main(String[] args){
        String str = "abaacdaefaah";
        findOccurance(str,0,'a');
        //Time Complexity = O(N)
        //Because Iterating once throw the give String
    }

}
