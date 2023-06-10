package Recursion;

import java.util.HashSet;

// Print all unique subsequence of string , For ag "aaa" => "a,aa,aaa"
public class UniqueSubsequence {
    public static void printSubsequences(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        printSubsequences(str, idx+1, newString,set);
        printSubsequences(str, idx+1, newString+currChar,set);


    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubsequences(str, 0, "",set);

    }
}
