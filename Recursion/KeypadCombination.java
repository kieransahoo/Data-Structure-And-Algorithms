package Recursion;

public class KeypadCombination {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str,int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i = 0 ; i<mapping.length();i++)
        {
            printCombination(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){
        String str = "22";
        printCombination(str,0,"");
        // Time Complexity => O(N^4) because , max per number can have max 4 chars
    }
}
