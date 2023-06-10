package Recursion;

import java.util.HashSet;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
           removeDuplicate(str, idx+1, newStr);
        }else{
            newStr += currChar;
            map[currChar-'a']=true;
            removeDuplicate(str, idx+1, newStr);
        }
    }

    public static void main(String[] args){
        String str = "abbccda";
        removeDuplicate(str,0,"");

        //Iterative - Method
        char[] chr =str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i<chr.length;i++)
        {
            hs.add(chr[i]);
        }
        for(char c : hs){
            System.out.print(c);
        }
        //2-0(N)
    }

}
