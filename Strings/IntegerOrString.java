package Strings;




public class IntegerOrString {

    // Program to check if input is an integer or a string

    public static boolean isNumber(String s){
        for(int i = 0; i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i))==false){
                return false;
            }

        }

        return true;
    }





    public static void main(String[] args){
        String str = "678";

        try{
            Integer.parseInt(str);
            System.out.println("Integer");
        }catch(NumberFormatException e){
            System.out.println("String");
        }



//        if(isNumber(str))
//            System.out.println("Integer");
//        else
//            System.out.println("String");

    }


}
