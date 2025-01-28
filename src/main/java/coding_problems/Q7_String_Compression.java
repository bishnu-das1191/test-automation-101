package coding_problems;

public class Q7_String_Compression {

    public static void main(String[] args) {

        /**
         *  java program to compress a given string
         */

        String input = "aabcccccaaa";  // a2b1c5a3

        String result = "";
        int count = 1;
        for(int i=0; i<input.length(); i++){       // O(n)

            if(i+1 < input.length() && input.charAt(i) == input.charAt(i+1)){
                count ++;
            }else{
                result += input.charAt(i);
                result += count;
                count = 1;
            }
        }

        result = result.length() < input.length() ? result : input;
        System.out.println(result);
    }
}
