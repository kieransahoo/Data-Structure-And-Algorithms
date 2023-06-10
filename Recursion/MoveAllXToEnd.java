package Recursion;

public class MoveAllXToEnd {

    public static void moveXIterative(String str){
        String str1 = "";
        String str2 = "";
        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i)=='x'){
                str2 += str.charAt(i);
            }else{
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1+str2);
    }

    public static void moveAllX(String str,int idx, int count, String newStr){

        if(idx == str.length()){
            for(int i = 0; i<count ;i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newStr);
        }else{
            newStr += currChar;
            moveAllX(str, idx+1, count, newStr);
        }
    }


    public static void main(String[] args){
        String str = "axbcxxd";

        // Iterative Method
        System.out.println("Iterative Method");
        moveXIterative(str);
        // Recursive Methods
        System.out.println("Recursive Method");
        moveAllX(str,0,0,"");

        // Time Complexity => O(N);


    }

}
