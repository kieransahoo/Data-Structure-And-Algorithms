package Strings;

public class DecodeStringFromGivenSet {

    public static char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args){
        char charSet[] = "qwertyuiopasdfghjklzxcvbnm".toCharArray();

        char[] str1 = "egrt".toCharArray();

        String s2 = "";
        for (char i : str1)
            s2 += alphabets[i];

        System.out.println(s2);
    }
}
