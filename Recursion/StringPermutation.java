package Recursion;

public class StringPermutation {

    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i<str.length();i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr,permutation+currChar+" ");
        }
    }

    public static void main(String[] args){
       String str = "abc";
       //no of permutation => n!, eg 3! = 6;
        printPermutations(str,"");

        //Time Complexity => O(N!)  Ex :: _(n),_(n-1),_(n-2);


    }
}
