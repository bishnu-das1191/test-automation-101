package coding_problems;

public class Q9_PatternPrint {
    public static void main(String[] args) {

        /**

         String s = "JAVA";

         J
         JA
         JAV
         JAVA

         */

        String str = "JAVA";


        for(int i = str.length(); i>0; i--){
            System.out.println(str.substring(0,str.length()-i+1));  // O(n)
        }

    }
}
