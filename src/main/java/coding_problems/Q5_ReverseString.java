package coding_problems;

import java.util.Arrays;

public class Q5_ReverseString {

    public static void main(String[] args) {

        String str = "automation";

        StringBuilder reverse = new StringBuilder();

        for(int i = str.length()-1; i>=0; i--){
            reverse.append(str.charAt(i));          // TC : O(n)
        }
        System.out.println(reverse);
    }
}

class ReverseString_optimized {
    public static void main(String[] args) {

        String str = "automation";

        char[] inputArr = str.toCharArray();
        int i = 0;
        int j = inputArr.length-1;

        while(i<j){                          // TC : O(n/2) = O(1/2*n) = O(n)
            char temp = inputArr[i];
            inputArr[i] = inputArr[j];
            inputArr[j] = temp;
            i++;
            j--;
        }

        System.out.println(String.valueOf(inputArr));
    }

    // TEA // EAT
    // madam
}
