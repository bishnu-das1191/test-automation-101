package coding_problems;

public class Q8_PrintLetterTwice {
    public static void main(String[] args) {

        /**
         *  Print each letter twice.
         *
         */

        String str  = "hello";

        StringBuilder result = new StringBuilder();
        char[] ch = str.toCharArray();

        for(char c : ch){
            result.append(c).append(c);   // O(n)
        }

        System.out.println(result);

    }
}
