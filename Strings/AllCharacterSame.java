package Strings;

import java.util.HashSet;
import java.util.Set;

public class AllCharacterSame {

    //Quick way to check if all the characters of a string are same

    public static boolean UsingLoop(String s){
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) != s.charAt(0)){
                return false;
            }
        }
        return true;
    }

    public static void UsingHashSet(String s){

        Set<Character> s1 = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
           s1.add(s.charAt(i));
        }

        if(s1.size()==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }




    public static void main(String[] args){
        String str = "aaaaa";

        System.out.println(UsingLoop(str));

        UsingHashSet(str);



    }

}
