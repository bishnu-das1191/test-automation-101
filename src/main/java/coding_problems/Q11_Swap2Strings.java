package coding_problems;

public class Q11_Swap2Strings {

    public static void main(String[] args) {

        /**
         *  Swap 2 Strings without using 3rd variable
         */

        String str1 = "Hello";
        String str2 = "World";

        str1 = str1 + str2; //HelloWorld
        str2 = str1.substring(0,str1.length() - str2.length()); // Hello
        str1 = str1.substring(str2.length());  // World

        System.out.println("After Swap");
        System.out.println("str1 : "+str1);
        System.out.println("str2 : "+str2);

    }
}
