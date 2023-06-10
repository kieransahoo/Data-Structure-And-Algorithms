package Recursion;

//Print All Subsequence of the String
public class Subsequences {
 public static void printSubsequences(String str, int idx, String newString){
     if(idx == str.length()){
         System.out.println(newString);
         return;
     }

     char currChar = str.charAt(idx);

     printSubsequences(str, idx+1, newString+currChar);
     printSubsequences(str, idx+1, newString);

 }

 public static void main(String[] args){
     String str = "abc";
     printSubsequences(str,0,"");
     //subsequence => 2^n(string length)
     // 2^(n)+2^(n-1)+......
     //a(r^n - 1)/r-1
     //Time complexity => O(2^n)(geometricprog sum of functions)


 }

}
